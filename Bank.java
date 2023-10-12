import java.util.Scanner;

class BankAcc {

	int accno;
	String hname;
	double balance = 0;
	double amount;
	Scanner scan = new Scanner(System.in);

	void createAcc() {

		System.out.println("Enter Account Number");
		accno = scan.nextInt();
		scan.nextLine();
		System.out.println("Enter the Name of the Holder");
		hname = scan.nextLine();
	}

	void depo() {
		
		System.out.println("Enter the amount to be deposited");
		amount = scan.nextDouble();
		balance += amount;

		System.out.println("Amount Deposited: "+amount);
	}

	void withdraw() {

		System.out.println("Enter the amount to be withdrawn");
		amount = scan.nextDouble();
		balance -= amount;

		System.out.println("Amount Withdrawn: "+amount);

	}

	void checkBal() {

		System.out.println("Current Balance: "+balance);
	}

	void displayData() {

		System.out.println("ACCOUNT DETAILS");
		System.out.println("---------------");
		System.out.println("Account Number: "+accno);
		System.out.println("Account Holder: "+hname);
		System.out.println("Current Balance: "+balance);
	}
}

class Bank {

	public static void main(String[] args) {

		int menu=0;
		Scanner scan = new Scanner(System.in);
		BankAcc a = new BankAcc();

		System.out.println("\n\nWELCOME TO THE BANK");
		System.out.println("-------------------");

		while(menu != 6) {

			System.out.println("\n\tCreate an Account (1)");
			System.out.println("\tDeposit (2)");
			System.out.println("\tWithdraw (3)");
			System.out.println("\tCheck Balance (4)");
			System.out.println("\tDisplay Account Details (5)");
			System.out.println("\tExit (6)\n");
			System.out.print("Enter a Choice: ");
			menu = scan.nextInt();
			System.out.println();

			if(menu == 1)
				a.createAcc();
			else if(menu == 2)
				a.depo();
			else if(menu == 3)
				a.withdraw();
			else if(menu == 4)
				a.checkBal();
			else if(menu == 5)
				a.displayData();
			else if(menu == 6) {
				System.out.println("Exiting the Program\nThank You!");
				System.out.println("--------------------");
			} else
				System.out.println("ERROR: Invalid Choice!\nPlease enter a valid opton");
		}
	}
}
