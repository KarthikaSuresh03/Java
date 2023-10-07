//Develop a Java program that takes the student's score as input and prints their corresponding grade. Use an else if ladder to define the grading criteria(A 90+, B 89-80,..)

import java.util.Scanner;

class StudentScore {

	public static void main(String[] args) {

		double score;
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("\nEnter Your Score");
		score = scan.nextDouble();
		
		if(score<0||score>100)
			System.out.println("ERROR: RANGE OF SCORE = [0,100]");
		else {
			System.out.print("\nYour Grade: ");

			if(100>=score && score>=90)
				System.out.println("A");
			else if(89>=score && score>=80)
				System.out.println("B");
			else if(79>=score && score>=70)
				System.out.println("C");
			else if(69>=score && score>=60)
				System.out.println("D");
			else if(59>=score && score>=50)
				System.out.println("P");
			else
				System.out.println("F");
		}
	}
}