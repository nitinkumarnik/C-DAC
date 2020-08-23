
public class Electricity {

	void calculateBill(int units) {
		float bill = 0.0f;
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
	    
	    System.out.println("Bill Amount: " + bill);
		
	}
	
	
}
