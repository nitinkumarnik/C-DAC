import java.util.Scanner;

public class maxMinOfArray {
	
	// to find max of an array.
	public static int max(int[] arr) {
		int maxNum = 0;
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > maxNum) {
				maxNum = arr[i];
			}
		}
		return maxNum;
	}
	
	// to find min of an array.
	public static int min(int[] arr) {
		int minNum = arr[0];
		
		for (int i=0; i<arr.length; i++) {
			if (arr[i] < minNum) {
				minNum = arr[i];
			}
		}
		return minNum;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Size of array: ");
		int len = scan.nextInt();
		
		int[] numArr = new int[len];
		
		System.out.println("Enter elements of Array:");
		for (int i=0; i<len; i++) {
			numArr[i] = scan.nextInt();
		}
		
		System.out.println("Maximum element of the array: " + max(numArr));
		System.out.println("Minimum element of the array: " + min(numArr));
		
		
		scan.close();
	}
	
	
}
