import java.util.Scanner;

public class SavingAccount extends BankAccount {

	float interestRate = 0.05f;
	
	SavingAccount(int accountNumber, float totalBalance) {
		super(accountNumber, totalBalance);
	}
	
	void addInterest() {
		float interest = totalBalance * interestRate;
		totalBalance += interest;
		System.out.println("Interest: " + interest);
	}
	
}


class Bank {
	
	public static BankAccount createObject(int choice) {
		
		if (choice == 1) {
			return new CheckingAccount(346432543, 70000);
		} else if (choice == 2) {
			return new SavingAccount(1234567788, 50000);
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		BankAccount b;
		
		/*
		 * b = new CheckingAccount(346432543, 70000); b.getBalance(); b.addInterest();
		 * b.getBalance(); b.withdraw(70800); b.withdraw(40);
		 * 
		 * b = new SavingAccount(1234567788, 50000); b.getBalance(); b.addInterest();
		 * b.getBalance();
		 */
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Open a Bank Account.");
		System.out.println("Choose:\n1. Checking account(Opening Fee 500)");
		System.out.println("2. Saving account");
		System.out.println("I choose: ");
		int choice = sc.nextInt();
		
		b = createObject(choice);
		b.getBalance(); 
		b.addInterest();
		b.getBalance(); 
		b.withdraw(70800); 
		b.withdraw(40);
		
		sc.close();
		
	}
}
