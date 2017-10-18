package main;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;

public class StarTest15 {
	public static String sprintf(String format, Object... args) {
		return String.format(format, args);
	}
	public static void printf(String format, Object... args) {
		System.out.printf(format, args);
	}
	public static void start(int size) {
		
		String[] res = {"", "", "", "", ""};
		for(int i=1;i<=size;++i) {
			res[0] += sprintf("%s%s\n", new String(new char[size - i]).replace("\0", " "), new String(new char[i]).replace("\0", "*"));
			res[2] += sprintf("%s\n", new String(new char[i]).replace("\0", "*"));
			res[4] += sprintf("%s\n", new String(new char[size]).replace("\0", "*"));
		}
		for(int i=size;i>=1;--i) {
			res[1] += sprintf("%s%s\n", new String(new char[size - i]).replace("\0", " "), new String(new char[i]).replace("\0", "*"));
			res[3] += sprintf("%s\n", new String(new char[i]).replace("\0", "*"));
		}
		Arrays.asList(res).forEach(e -> printf("%s", e));
	}

	public static void main(String[] args) {
		printf("%d %s\n", 15, "張立帆");
		start(5);
	}

}
