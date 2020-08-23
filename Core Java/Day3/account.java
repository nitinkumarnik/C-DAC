
public class account {
	
	int accno;
	String accname;
	float amount;
	
	void withdraw(float wamount) {
		if (amount <= 100) {
			System.out.println("You can't withdraw you're amount is less than Rs. 100.");
		} else if (amount < wamount) {
			System.out.println("Your balance is Rs. " + amount + ". Enter less than that.");
		} else {
			System.out.println("Your balance is Rs. " + (amount - wamount));
			amount = amount - wamount;
		}
	}
	
	void deposit(float damount) {
		amount = amount + damount;
		System.out.println("Your balance is now Rs. " + amount);
	}
	
	void interest(int yr) {
		float in = amount * 0.2f;
		System.out.println("Interest is Rs. " + in);
	}
	
	
	public static void main(String[] args) {
		
		account a1 = new account();
		
		a1.accno = 123456;
		a1.accname = "Aj";
		a1.amount = 40000;
		
		a1.deposit(5000);
		a1.withdraw(20000);
		a1.interest(2);
		
	}
	
}
