package classroom;

import java.util.ArrayList;

public class AlistString {

	public static void main(String[] args) {
		
		ArrayList<String> als = new ArrayList<>();
		
		als.add("Dell");
		als.add("Philips");
		als.add("Motorola");
		als.add("WD");
		
		System.out.println(als);
		
		als.set(3, "Western Digital");
		
		System.out.println(als);


		
	}
	
	
}
