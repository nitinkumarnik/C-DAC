
public abstract class Card implements PaymentMethod {

	String nameOnCard;
	String num;
	String cvv;

	Card(String nameOnCard, String num, String cvv) {
		this.nameOnCard = nameOnCard;
		this.num = num;
		this.cvv = cvv;
	}
	
	abstract void getType();
	
	abstract void executeTransaction(int amount);
	
}


class CCard extends Card {
	
	CCard(String nameOnCard, String num, String cvv) {
		super(nameOnCard, num, cvv);
	}
	
	void getType() {
		System.out.println("Credit Card");
	}
	
	void executeTransaction(int amount) {
		this.pay(amount);
	}
	
	public void pay(int amount) {
		System.out.println("Paying " + amount + " via Credit Card.");
	}
	
}


class DCard extends Card {
	
	DCard(String nameOnCard, String num, String cvv) {
		super(nameOnCard, num, cvv);
	}
	
	void getType() {
		System.out.println("Debit Card");
	}
	
	void executeTransaction(int amount) {
		this.pay(amount);
	}
	
	public void pay(int amount) {
		System.out.println("Paying " + amount + " via Debit Card.");
	}
	
}


//class CardTans {
//	
//	public static void main(String[] args) {
//		
//		Card c;
//		
//		c = new CCard("Bala", "23555443", "344");
//		c.getType();
//		c.executeTransaction(30040);
//		
//		c = new DCard("Messi", "5244443", "666");
//		c.getType();
//		c.executeTransaction(5000);
//		
//	}
//	
//	
//}