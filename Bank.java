import java.util.Scanner;

class BankAcc {

	int accno=-1;
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
		
		if(amount<=0)
			System.out.println("ERROR!\nPlease enter a valid amount for depositing");

		else {
			balance += amount;
			System.out.println("Amount Deposited: "+amount);
		}
	}

	void withdraw() {

		System.out.println("Enter the amount to be withdrawn");
		amount = scan.nextDouble();

		if(amount>balance)
			System.out.println("ERROR!\nWithdrawal amount is greater than the current balance");

		else {
			balance -= amount;
			System.out.println("Amount Withdrawn: "+amount);
		}

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

			switch(menu) {
		
				case 1 : {

					a.createAcc();
					break;
				}
				case 2 : {

					if(a.accno != -1)
						a.depo();
					else
						System.out.println("Create an Account First");
					break;
				}
				case 3 : {

					if(a.accno != -1)
						a.withdraw();
					else
						System.out.println("Create an Account First");
					break;
				}
				case 4 : {

					if(a.accno != -1)
						a.checkBal();
					else
						System.out.println("Create an Account First");
					break;

				}
				case 5 : {

					if(a.accno != -1)
						a.displayData();
					else
						System.out.println("Create an Account First");
					break;
				}
				case 6 : {
			
						System.out.println("Exiting...");
						System.out.println("Thank You!");
						System.out.println("----------------------");
					break;
				}
				default : {

					System.out.println("ERROR: Invalid Choice!\nPlease enter a valid option");
					break;

				}
			}
		}
	}
}
