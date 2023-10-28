//Write a program to read numbers in a file and copy the prime numbers among them into another file

import java.util.*;
import java.io.*;

class FilePrime{

	static int primeCheck(int n) {
		
		int i;
		for (i = 2; i <= (n/2); i++) {
		
			if (n % i == 0)
				break;
		}
		if (i > (n/2))
			return 1;
		else 
			return 0;
	}

	public static void main(String[] args)throws IOException {

		int num, check;
		//String fname;
		//Scanner scan = new Scanner(System.in);

		//System.out.println(System.getProperty("user.dir"));
		//System.out.println("Enter the Filename");
		//fname = scan.nextLine();
		FileReader fin = new FileReader("test.txt");
		FileWriter fout = new FileWriter("Prime.txt");
		Scanner fs = new Scanner(fin);

		while (fs.hasNextInt() == true) {

			num = fs.nextInt();
			check = primeCheck(num);
			if (check == 1)
				fout.write(Integer.toString(num)+"\t");
		}
		fs.close();
		fin.close();
		fout.close();
		System.out.println("Program Executed...");
	}
}
