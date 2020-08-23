

public class BankAccount {

	int accountNumber;
	float totalBalance;
	
	BankAccount(int accountNumber, float totalBalance) {
		this.accountNumber = accountNumber;
		this.totalBalance = totalBalance;
	}
	
	
	void deposit(float amount) {
		
		totalBalance += amount;
		System.out.println("Adding...");
		System.out.println("Balance Rs. " + totalBalance);
		
	}
	
	
	void withdraw(float amount) {
		
		if (totalBalance < 100) {
			System.out.println("Balance is less than Rs. 100. Can not be withdrawed.");
		} else if (totalBalance < amount) {
			System.out.println("Balance is less than entered amount...");
			System.out.println("Balance is Rs. " + totalBalance);
		} else {
			totalBalance -= amount;
			System.out.println("Deducting...");
			System.out.println("Balance Rs. " + totalBalance);
		}
		
		
	}
	
	void getBalance() {
		System.out.println("Account No.: " + accountNumber);
		System.out.println("Balance Rs.: " + totalBalance);
	}
	
	
}



class CheckingAccount extends BankAccount {
	
	float fee = 500.0f;
	
	CheckingAccount(int accountNumber, float totalBalance) {
		super(accountNumber, totalBalance);
		deductFee();
	}
	
	void deductFee() {
		totalBalance = totalBalance - fee;
		System.out.println("Deducting Fee... Rs.: " + fee);
		System.out.println("Balance : " + totalBalance);
	}
}



class SavingAccount extends BankAccount{
	
	float intrestRate;
	
	SavingAccount(int accountNumber, float totalBalance, float intrestRate) {
		super(accountNumber, totalBalance);
		this.intrestRate = intrestRate;
	}
	
	void addIntrest(int yr) {
		float intrest = (totalBalance * yr * intrestRate) / 100;
		totalBalance = totalBalance + intrest;
		System.out.println("Adding intrest... Rs. " + intrest);
		System.out.println("Balance is Rs.: " + totalBalance);
	}
}



class Bank {
	
	public static void main(String[] args) {
		
		SavingAccount sa = new SavingAccount(50243367, 50000.0f, 4.4f);
		sa.getBalance();
		sa.addIntrest(3);
		
		CheckingAccount ca = new CheckingAccount(6252465, 80000.0f);
		ca.getBalance();
	}
	
}