package main;

import java.util.Arrays;
import java.util.List;
import java.sql.*;
import java.io.*;
import java.security.*;
import java.security.spec.*;
import java.util.Base64;
import java.nio.file.*;
import java.nio.file.Files;

import org.apache.logging.log4j.*;
import org.apache.logging.log4j.core.config.Configurator;

public class Main {
	private static Connection con = null;
	private static String keypath = "/home/johnny/.ssh/";
	private static Logger log = LogManager.getLogger(Main.class);

	// Load the keys from files.
	public static KeyPair loadKeyPair(String path, String algorithm)
			throws IOException, NoSuchAlgorithmException, InvalidKeySpecException {

		// Initiate the factory with specified algorithm.
		KeyFactory keyFactory = KeyFactory.getInstance(algorithm);

		// Read public key from file.
		File fileForPublicKey = Paths.get(path, "db_rsa.public").toFile();
		log.info("Public key will be loaded from '{}'.", fileForPublicKey);
		
		File fileForPrivateKey = Paths.get(path, "db_rsa.private").toFile();
		log.info("Private key will be loaded from '{}'.", fileForPrivateKey);

        
		PublicKey publicKey = null;
		PrivateKey privateKey = null;
		try {
			byte[] privateKeyContent = Files.readAllBytes(Paths.get(path, "db_rsa.public"));			
			X509EncodedKeySpec spec = new X509EncodedKeySpec(privateKeyContent);
			publicKey = keyFactory.generatePublic(spec);
		}
		catch (Exception e) {
			log.trace("Public key load failure {}", e.getMessage());
		}

		try {
			byte[] privateKeyContent = Files.readAllBytes(Paths.get(path, "db_rsa.private"));
			EncodedKeySpec spec = new PKCS8EncodedKeySpec(privateKeyContent);
			privateKey = keyFactory.generatePrivate(spec);
		}catch(Exception e) {
			log.trace("Private key load failure {}", e.getMessage());
		}
		return new KeyPair(publicKey, privateKey);
	}

	public static void ConnectDB() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			// 註冊driver
			con = DriverManager.getConnection("jdbc:mysql://localhost/test?useUnicode=true&characterEncoding=Big5",
					"root", "Crypto!@3");
			System.out.println(con.isClosed());

		} catch (ClassNotFoundException e) {
			System.out.println("DriverClassNotFound :" + e.toString());
		} catch (SQLException x) {
			System.out.println("Exception :" + x.toString());
		}
	}

	public static void printKeyPair(KeyPair keyPair) {
		log.trace("  public key: {}", Base64.getEncoder().encodeToString(keyPair.getPublic().getEncoded()));
		log.trace("  private key: {}", Base64.getEncoder().encodeToString(keyPair.getPrivate().getEncoded()));
	}

	public static void LoadRSAKey() {
		try {
			KeyPair loadedKeyPair = loadKeyPair(keypath, "RSA"); // Load the keys from files

			// Print the loaded key pair to ensure that they are exactly the same.
			log.trace("Loaded key pair:");
			printKeyPair(loadedKeyPair);
		} catch (Exception e) {

		}
	}

	public static void main(String[] args) {
		Configurator.setRootLevel(Level.TRACE);
		LoadRSAKey();
		ConnectDB();
	}
}