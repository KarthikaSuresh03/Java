//Implement a simple file encryption program that reads a text file, encrypts its contents and then saves the encrypted data to a new file

import java.util.*;
import java.io.*;

class FileEncryption {

	public static void main(String[] args)throws IOException {

		int i, value;
		char enc;
		
		Scanner scan = new Scanner(System.in);
		FileInputStream fin = new FileInputStream("testEnc.txt");
		FileOutputStream fout = new FileOutputStream("encryptedData.txt");
		System.out.println("Enter the encryption value");
		value = scan.nextInt();
		
		while ((i = fin.read()) != -1) {

			i = i + value;
			enc = (char)i;
			fout.write(enc);
		}
		fin.close();
		fout.close();
		System.out.println("Data Encrypted...");
	}
}
