import java.util.Scanner;

public class ElectricityBill {
	
	int cnum;
	String cname;
	int units;
	float bill;
	
	void readData() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the details(cnum, name, units):");
		cnum = scan.nextInt();
		scan.nextLine();
		cname = scan.nextLine();
		units = scan.nextInt();
		
		
	}
	
	void showData() {
		System.out.println("Details of customer: ");
		System.out.println("Customer Number: " + cnum);
		System.out.println("Name: " + cname);
		System.out.println("Units Consumed: " + units);
	}
	
	float computeBill() {
		
		if (units > 600) {
	        bill += (units - 600) * 5.00;
	        units = 600;
	    }

	    if (units <= 600) {
	        bill += (units - 300) * 3.00;
	        units = 300;
	    }

	    if (units <= 300) {
	        bill += (units - 100) * 2.00;
	        units = 100;
	    }

	    if (units <= 100) {
	        bill += units * 1.20;
	    }
	    
	    return bill;
	}
	
	
	public static void main(String[] args) {
		ElectricityBill c1 = new ElectricityBill();
		ElectricityBill c2 = new ElectricityBill();
		
		c1.readData();
		c1.showData();
		System.out.println("Bill: " + c1.computeBill());
		
		c2.readData();
		c2.showData();
		System.out.println("Bill: " + c2.computeBill());
		
		
	}

}
