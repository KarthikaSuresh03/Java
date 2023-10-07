import java.util.Scanner;

class EvenOdd {

	public static void main(String[] args) {

		int a[], n, i, ceven=0, codd=0, czero=0;
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the number of elements");
		n = scan.nextInt();
		a = new int[n];

		System.out.println("Enter the elements");

		for(i=0;i<n;i++) {

			System.out.println("Element "+(i+1));
			a[i] = scan.nextInt();
			
			if(a[i] == 0)
				czero++;
			else {

				if(a[i]%2 == 0)
					ceven++;
				else
					codd++;

			}

		}
		System.out.println("No. of even elements = "+ceven);
		System.out.println("No. of odd elements = "+codd);
		System.out.println("No. of zeroes = "+czero);

	}
}
