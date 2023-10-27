//Implement a simple file encryption program that reads a text file, encrypts its contents and then saves the encrypted data to a new file

import java.util.*;
import java.io.*;

class FileEncryption {

	public static void main(String[] args) {

		int i;
		char c;

		FileReader fin = new FileReader("test2.txt");
		FileWriter fout = new FileWriter("encryptedData.txt");
		Scanner fs = new Scanner(fin);

		while (fs.hasNextInt() == true) {

			i = fs.nextInt();
			i = i + 3;
			c = (char)i;

			fout.write(Integer.toString(c));
		}
		fs.close();
		fin.close();
	}
}
