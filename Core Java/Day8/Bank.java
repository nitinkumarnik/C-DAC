
public class Bank implements CreditCard {

	
	public void rupees() {
		System.out.println("Payment in Rupees.");
	}
	
	public void dollars() {
		System.out.println("Payment in Dollars.");
	}
	
	public void pounds() {
		System.out.println("Payment in Pounds.");
	}
	
	public static void main(String[] args) {
		
		CreditCard c;
		
		c = new Bank();
		
		c.rupees();
		c.dollars();
		c.pounds();
		
		
	}
	
	
	
}
