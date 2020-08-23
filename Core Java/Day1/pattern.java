
public class pattern {
	public static void main(String[] args) {
		int numStar = 9;
		
		for (int i=1; i<=(numStar/2)+1; i++) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

		for (int i=(numStar/2); i>=1; i--) {
			for (int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
	}
}
