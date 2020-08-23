import java.util.Scanner;

public class Player {
	// scanner class
	Scanner scan = new Scanner(System.in); 

	// members of class/ non static variable / instance
	String name;
	int age;
	String countryname;
	int totalrun;
	
	// non static method / instance method
	void setPlayer() {
		System.out.println("Name: ");
		name = scan.nextLine();
		System.out.println("Age: ");
		age = scan.nextInt();
		scan.nextLine();
		System.out.println("Country: ");
		countryname = scan.nextLine();
		System.out.println("Total run: ");
		totalrun = scan.nextInt();
	}
	
	// instance method
	void playerWithMoreRuns() {
		// System.out.println("Doing the computation...");
		if (totalrun > 5000) {
			getPlayer();
		}
	}
	
	// instance method
	void getPlayer() {
		System.out.println("\nName: " + name);
		System.out.println("Age: " + age);
		System.out.println("Country: " + countryname);
		System.out.println("Total runs: " + totalrun);
	}
	
	
	// Main method
	public static void main(String[] args) {
			
		// Creating array of player objects
		Player[] p = new Player[5];
		
		// loop to enter the values to the player objects
		for (int i=0; i<p.length; i++) {
			p[i] = new Player();
			System.out.println("Enter details of player " + (i+1) + ": ");
			p[i].setPlayer();
		}
		
		// loop to show the players to console
		System.out.println("\nShowing details of player with more than 5000 total runs");
		for (int i=0; i<p.length; i++) {
			p[i].playerWithMoreRuns();
		}
		
	}
	
	
	
	
}
