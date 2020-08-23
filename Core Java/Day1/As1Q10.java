import java.util.Scanner;

public class As1Q10 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter electricity readings: ");
		int reading = input.nextInt();
		
		double bill = 0;
		
		if (reading > 600) {
	        bill += (reading - 600) * 5.00;
	        reading = 600;
	    }

	    if (reading <= 600) {
	        bill += (reading - 300) * 3.00;
	        reading = 300;
	    }

	    if (reading <= 300) {
	        bill += (reading - 100) * 2.00;
	        reading = 100;
	    }

	    if (reading <= 100) {
	        bill += reading * 1.20;
	    }
	    
	    System.out.println(bill);
		
		input.close();
	}

}
