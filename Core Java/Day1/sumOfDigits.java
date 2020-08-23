import java.util.Scanner;

public class sumOfDigits {
	
	// to return sum of digits.
	static int sumDigits(int num) {
		int sum = 0;
		while (num > 0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}
	
	// main
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter number to find sum of its digits: ");
		int num = scan.nextInt();
		
		System.out.println("The sum of digits: " + sumDigits(num));
		
		scan.close();
	}
	
}
