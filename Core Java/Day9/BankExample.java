
public class BankExample {

	// NullPointerException e = new NullPointerException();
	
	void checkBalance(int amount) {
		
		LessAmount l = new LessAmount("Exception: Amount should not be less than 1000.");
		
		if (amount < 1000) {
			try {
				throw l;
			} catch (LessAmount ll) {
				//System.out.println(ll);
			}
		} else {
			System.out.println("Great.!!");
		}
	}
		
	
	
	public static void main(String[] args) {
		
		
		BankExample b = new BankExample();
		
		b.checkBalance(200);
		
	}
	
	
}
