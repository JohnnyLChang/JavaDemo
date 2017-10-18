package MyException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyFileOpen {
	public static class MyFile{
		public String filename;
		public String buffer;
		
		public MyFile(String filename) {
			this.filename = filename;
		}
		
		public void Readfile() throws FileNotFoundException {
			FileReader file = null;
			try {
				file = new FileReader(this.filename);
				byte[] data = new byte[16];
				try (BufferedReader bf = new BufferedReader(file);) {
					String line;
					while ((line = bf.readLine()) != null) {
						buffer += line;
					}
				}
			} catch (FileNotFoundException e) {
				throw e;
			} catch (IOException e) {
				System.out.println(e);
			} finally {
				try {
					if(file != null)
						file.close();
				} catch (IOException e) {
					
				}
			}
		}
		
		public void Writefile() {
			
		}
	}
	
	public static void main(String[] args) {
		String file = "test2";
		try {
			MyFile obj2 = new MyFile(file);
			obj2.Readfile();
			obj2.Writefile();
		}
		catch (FileNotFoundException e) {
			System.out.println("file " + file + " does not existed");
		}
		
		try {
			MyFile obj = new MyFile("test");
			obj.Readfile();
			obj.Writefile();
		}
		catch (Exception e) {
			
		}
	}

}
