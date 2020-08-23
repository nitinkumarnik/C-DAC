import java.util.Scanner;

public class revArray {

	public static int[] rev(int[] arr) {
		int[] revArr = new int[arr.length];
		
		for (int i=(arr.length - 1), j=0; i>=0; i--, j++) {
			revArr[j] = arr[i];
		}
		
		return revArr;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter size of Array: ");
		int len = scan.nextInt();
		int[] arr = new int[len];
		
		System.out.println("Enter elements of array: ");
		for (int i=0; i<len; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Entered array: ");
		for (int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nReversed array: ");
		int[] revArr = rev(arr);
		for (int i=0; i<revArr.length; i++) {
			System.out.print(revArr[i] + " ");
		}
		
		scan.close();
	}
	
}
