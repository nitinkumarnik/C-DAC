
public class ThrowExample {

	
	public static void validate(int age) {
		
		if (age > 18) {
			System.out.println("Elegible.");
		} else {
			NullPointerException e = new NullPointerException();
			throw e;
		}
		
	}
	
	
	public static void main(String[] args) {
	
		
		try {
			validate(17);
		} catch (NullPointerException e) {
			System.out.println("Custom thrown exception catched.");
		}
		
		System.out.println("Rest of Code.");
		
	}
	
	
	
}
