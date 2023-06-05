package oops;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Exception2 {
public static void main(String[] args) throws Exception {
	String filename="D://info.xlsx";
	FileInputStream instream = new FileInputStream(filename);
	
	System.out.println("Done");
}
}
