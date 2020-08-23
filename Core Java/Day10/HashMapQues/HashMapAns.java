package HashMapQues;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapAns {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void disp(HashMap<Integer, Book> hmb) {
		for (Map.Entry obj : hmb.entrySet()) {
			Book bk = (Book) obj.getValue();
			System.out.print(obj.getKey() + " - ");
			bk.display();
			System.out.println("-----------------------------------------------------------");
		}
	}
	
	
	private static void dispByKey(HashMap<Integer, Book> hmb) {
		
		System.out.println("Enter key: ");
		int ukey = sc.nextInt();
		
		if (hmb.containsKey(ukey)) {
			System.out.println(hmb.get(ukey).toString());	
		}
		
	}
	
	private static void discPub(HashMap<Integer, Book> hmb) {
		System.out.println("Enter publication name for 10% discount on that: ");
		String pub = sc.next();
		System.out.println(pub + "'s books now discounted.");
		
		for (Map.Entry book : hmb.entrySet()) {
			Book bk = (Book) book.getValue();
			if (bk.publication.equals(pub)) {
				bk.price -= (bk.price * 0.10);
			}
			
//			System.out.println(hmb.containsValue(pub));
//			if (hmb.equals(pub)) {
//				System.out.println("Worked");
//				System.out.println(book.getValue());
//			}
		}
		
	}
	
	
	
	public static void main(String[] args) {
		
//		Book[] b = new Book[5];
		
		HashMap<Integer, Book> hmb = new HashMap<>();
		
		Book b1 = new Book("Chanakya's Chant", 220f, "Ashwin Sanghi", 234523, "westland books");
		Book b2 = new Book("Middle School", 180f, "James Patterson", 541354, "young arrow");
		Book b3 = new Book("Corporate Chanakya", 250f, "Radhakrishan", 5485239, "Penguin");
		Book b4 = new Book("L.O.S.E.R.", 150f, "Dipen Ambalia", 12354, "Penguin");
		Book b5 = new Book("Intro to Algo", 560f, "Cormen", 987465, "phi");
		
		hmb.put(1001, b1);
		hmb.put(1002, b2);
		hmb.put(1003, b3);
		hmb.put(1004, b4);
		hmb.put(1005, b5);
		
		disp(hmb);
		
		dispByKey(hmb);
		
		discPub(hmb);
		
		disp(hmb);
		
		
		System.out.println("---- Ends ----");
		
	}



	

}
