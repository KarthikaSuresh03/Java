import java.util.Scanner;

class Calculator {

	public static void main(String[] args) {
		
		int z = 0, menu;
		double num1, num2;
		Scanner scan = new Scanner(System.in);
		
		do {		
			System.out.println("\nCALCULATOR");
			System.out.println("----------\n");
			System.out.println("MENU");
			System.out.println("\t1 ADDITION");
			System.out.println("\t2 SUBTRACTION");
			System.out.println("\t3 MULTIPLICATION");
			System.out.println("\t4 DIVISION");
			System.out.println("\t5 EXIT");
			System.out.print("\nEnter a Choice:");
			menu = scan.nextInt();
			
			switch(menu) {
			
				case 1: {
					System.out.print("\nEnter the First Number: ");
					num1 = scan.nextDouble();
					System.out.print("Enter the Second Number: ");
					num2 = scan.nextDouble();
					System.out.println(num1+" + "+num2+" = "+(num1+num2));
					break;
				}
				case 2: {
					System.out.print("Enter the First Number: ");
					num1 = scan.nextDouble();
					System.out.print("Enter the Second Number: ");
					num2 = scan.nextDouble();
					System.out.println(num1+" - "+num2+" = "+(num1-num2));
					break;
				}
				case 3: {
					System.out.print("Enter the First Number: ");
					num1 = scan.nextDouble();
					System.out.print("Enter the Second Number: ");
					num2 = scan.nextDouble();
					System.out.println(num1+" * "+num2+" = "+(num1*num2));
					break;
				}
				case 4: {
					System.out.print("Enter the First Number: ");
					num1 = scan.nextDouble();
					System.out.print("Enter the Second Number: ");
					num2 = scan.nextDouble();
					if(num2 == 0)
						System.out.println("ERROR: Number Cannot Be Divided by Zero !");
					else
						System.out.println(num1+" / "+num2+" = "+(num1/num2));
					break;
				}
				case 5: {
					System.out.println("Thank You !");
					System.out.println("------------");
					z=1;
					break;
				}
				default: {
					System.out.println("ERROR: Invalid Choice !");
					break;
				}
			}
		}while(z==0);
	}
}
