
public class As1Q2 {
	public static void main(String args[]) {
		int digit = 2345;
		int sum = 0;
		while(digit > 0) {
			sum +=digit % 10;
			digit /= 10;
		}
		System.out.println(sum);
	}
}
