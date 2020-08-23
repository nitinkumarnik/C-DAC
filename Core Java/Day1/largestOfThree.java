import java.util.Scanner; 

public class largestOfThree {
	
	public static int largestNum(int num1, int num2, int num3) {
		int largestNum;

		if (num1 >= num2 && num1 >= num3) {
			largestNum = num1;
		} else if (num2 >= num1 && num2 >= num3) {
			largestNum = num2;
		} else {
			largestNum = num3;
		}
		
		return largestNum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int num1 = scan.nextInt();
		System.out.println("Enter second number: ");
		int num2 = scan.nextInt();
		System.out.println("Enter third number: ");
		int num3 = scan.nextInt();
		
		System.out.println("The largest number is: " + largestNum(num1, num2, num3));
		
		scan.close();
	}
}
