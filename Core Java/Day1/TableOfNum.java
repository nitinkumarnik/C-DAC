import java.util.Scanner;

public class TableOfNum {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("I want table for: ");
		int table = scan.nextInt();
		
		for (int i=1; i<=10; i++) {
			System.out.println(table + " x " + i + " = " + i*table);
		}
		
		scan.close();
	}
}
