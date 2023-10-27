//Write a program to read numbers in a file and copy the prime numbers among them into another file

import java.util.*;
import java.io.*;

class FilePrime{

	public static void main(String[] args)throws IOException {

		int num, i;
		//String fname;
		Scanner scan = new Scanner(System.in);

		//System.out.println(System.getProperty("user.dir"));
		//System.out.println("Enter the Filename");
		//fname = scan.nextLine();
		FileReader fin = new FileReader("test.txt");
		FileWriter fout = new FileWriter("Prime.txt");
		Scanner fs = new Scanner(fin);

		while (fs.hasNextInt() == true) {

			num = fs.nextInt();
			int prime = 0;
			for (i = 2; i < (num/2); i++) {
		
				if ((num/2) % i == 0) {

					prime++;
					break;
				}
			}
			if (prime == 0)
				fout.write(Integer.toString(num)+"\t");
		}
		fs.close();
		fin.close();
	}
}
