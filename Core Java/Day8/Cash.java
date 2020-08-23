
public class Cash implements PaymentMethod {

	public void pay(int amount) {
		System.out.println("Paying " + amount + " via cash.");
	}
	
}



class DoTransaction {
	
	public static void main(String[] args) {
		
		PaymentMethod p;
		
		p = new Cash();
		
		p.pay(3000);
		
		Card c;
		
		c = new CCard("Bala", "23555443", "344");
		c.getType();
		c.executeTransaction(30040);
		
		c = new DCard("Messi", "5244443", "666");
		c.getType();
		c.executeTransaction(5000);
		
	}
	
}