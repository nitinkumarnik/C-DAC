package AListQues;

import java.util.Scanner;

public class Player {

	String name;
	int totalrun;
	int noofwicket;
	int noofmatches;
	int noofcentury;
	String country;
	String category;
	
	Player(String name, int totalrun, int noofwicket, int noofmatches, int noofcentury, String country) {
		this.name = name;
		this.totalrun = totalrun;
		this.noofwicket = noofwicket;
		this.noofmatches = noofmatches;
		this.noofcentury = noofcentury;
		this.country = country;
		this.category = null;
	}
	
	void display() {
		
		System.out.println("Name: "+ name + " | Run: "+ totalrun + " | Wicket: "+ noofwicket + " | Matches: "+ noofmatches + " | Centuries: "+ noofcentury +" Country: " + country + " | Category : " + category);
	}
	
	/*********** Take values from user called in array.
	 * 
	void setPlayer() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		name = sc.next();
		
		System.out.println("Total Run: ");
		totalrun = sc.nextInt();
	
		System.out.println("No of wicket: ");
		noofwicket = sc.nextInt();
		
		System.out.println("No of matches: ");
		noofmatches = sc.nextInt();
		
		System.out.println("No of century: ");
		noofcentury = sc.nextInt();
		
		System.out.println("Country: ");
		country = sc.next();
		}
		*
		**************/
	
	
}
