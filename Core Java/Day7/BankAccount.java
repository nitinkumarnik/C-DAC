
public abstract class BankAccount {

	int accountNumber;
	float totalBalance;
	
	BankAccount(int accountNumber, float totalBalance) {
		this.accountNumber = accountNumber;
		this.totalBalance = totalBalance;
	}
	
	void deposit(float amount) {
		System.out.println("Depositing...");
		totalBalance += amount;
		System.out.println("Your balance now is Rupees " + totalBalance);
	}
	
	void withdraw(float amount) {
		if (totalBalance < amount) {
			System.out.println("Not enough balance. Enter less amount.");
		} else if ( totalBalance < 500) {
			System.out.println("Account balance is less than 500. You can't withdraw.");
		} else {
			System.out.println("Withdrawing...");
			totalBalance -= amount;
			System.out.println("You withdrawed " + amount + ".\nOutstanding balance is " + totalBalance);
		}
	}
	
	void getBalance() {
		System.out.println("Your Balance is " + totalBalance);
	}
	
	abstract void addInterest();
	
}
