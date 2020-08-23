import java.util.Scanner;

public class secondLargestArray {

	public static int secondLargest(int[] arr) {
		for (int i=0; i<arr.length; i++) {
			for (int j=i+1; j<arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr[arr.length-2];
	}
	
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Size of Array: ");
		int len = scan.nextInt();
		int[] arr = new int[len];
		
		System.out.println("Enter elements of Array: ");
		for (int i=0; i<len; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.println("Entered Array: ");
		for (int i=0; i<len; i++) {
			System.out.print(arr[i] + " ");
		}
		
		System.out.println("\nSecond Largest element is: " + secondLargest(arr));
			
		
		scan.close();
	}
	
	
}
