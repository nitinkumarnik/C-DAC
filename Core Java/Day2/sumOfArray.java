import java.util.Scanner;

public class sumOfArray {
	
	public static int arraySum(int[] numArray) {
		int sum = 0;
		
		for (int i=0; i<numArray.length; i++) {
			sum += numArray[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Array size: ");
		int len = scan.nextInt();
		int[] numArray = new int[len];
		
		System.out.println("Enter Array elements: ");
		for (int i=0; i<len; i++) {
			numArray[i] = scan.nextInt();
		}
		System.out.println("The sum of array elements: " + arraySum(numArray));
		scan.close();
	}

}
