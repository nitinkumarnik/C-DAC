
public class CheckingAccount extends BankAccount {

	int fee = 500;
	
	CheckingAccount(int accountNumber, float totalBalance) {
		super(accountNumber, totalBalance);
		this.deductFee();
	}
	
	void deductFee() {
		totalBalance -= fee;
		System.out.println("Fee is deducted from your account.");
	}
	
	void addInterest() {
		float interest = totalBalance * 0.02f;
		System.out.println("Interest: " + interest);
		totalBalance += interest;
	}
	
}
