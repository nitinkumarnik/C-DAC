import java.util.Scanner;

public class As1Q3 {
	
	public static int revNum(int num) {
		int rev = 0;
		while(num > 0) {
			rev = rev * 10 + (num%10);
			num /= 10;
		}
		return rev;
	}
	
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int num;
		System.out.println("Enter a number to reverse: ");
		num = scan.nextInt();
		System.out.println("The reverse is: " + revNum(num));
		
		scan.close();
	}
}
