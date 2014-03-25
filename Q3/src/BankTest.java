
import java.util.Scanner;

public class BankTest {

	public static void main(String[]args){
		
		Bank B;
		Account A;
		double interest;
		int accountNumber;
		Scanner scan = new Scanner(System.in);
		
		B = new Bank();
		interest = 0.15;
		accountNumber = 1947;
		
		System.out.println("Test to check if accounts are working");
		
		A = new SavingAccount(accountNumber,interest);

		A.deposit(15);
		A.deposit(150);
		A.print();
		A.withdraw(3);
						
		B.openAccount(A);
		B.print();
				
		System.out.println("Enter account number");
		accountNumber = scan.nextInt();
		A = B.getAccount(accountNumber);
		
		if(A==null)
			System.out.println("It does not exist.");
		else A.print();
	
		System.out.println("Closing an account");
		System.out.println("Give account number:");
		accountNumber = scan.nextInt();
		B.closeAccount(accountNumber);
		
		System.out.println("Please update bank");
		B.update();
		
		System.out.println("Bank status:");
		B.print();
	}		
}
