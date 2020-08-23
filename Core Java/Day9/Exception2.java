
public class Exception2 {

	public static void main(String[] args) {
		
		int[] num = {1, 2, 3, 4};
		
		for (int ele: num) {
			System.out.println(ele);
		}
		
		try {
			System.out.println(num[4]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception catched.");
		} finally {
			System.out.println("Final. Resource closed.");
		}
		
		
		
		System.out.println("REST OF CODE.");
		
	}
	
	
}
