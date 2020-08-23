
public class Customer extends Electricity {

	
	int cid;
	String cname;
	int units;
	
	Customer(int cid, String cname, int units) {
		this.cid = cid;
		this.cname = cname;
		this.units = units;
	}
	
	void display() {
		System.out.println("CID: " + cid);
		System.out.println("Customer Name: " + cname);
		System.out.println("Unit(s): " + units);
	}
	
	
}

class TestCustomer {
	
	public static void main(String[] args) {
		
		Customer c = new Customer(1033, "Electroman", 890);
		c.display();
		c.calculateBill(c.units);
	}
	
}
