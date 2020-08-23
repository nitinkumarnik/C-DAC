package classroom;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class ArrayListEg {

	static Scanner sc = new Scanner(System.in);
	
	private static void addPersonObject(ArrayList<Person> al) {
		Person p1 = new Person(1001, "Rohit");
		Person p2 = new Person(1002, "Mukesh");
		Person p3 = new Person(1003, "Indu");
		Person p4 = new Person(1004, "Shaktiman");
		
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
	}
	
	
	private static void dispPersonObject(ArrayList<Person> al) {
		
//		for (Person obj: al) {
//			System.out.println(obj);
//			obj.display();
//		}
		
//		----- choose either. --------
		Iterator it = al.iterator();
		while(it.hasNext()) {
			Person obj = (Person) it.next();
			obj.display();
//			System.out.println(it.next());
		}
		
	}
	
	
	private static void updateObject(ArrayList<Person> al) {
		
		
		System.out.println("Enter ID to update: ");
		int pid = sc.nextInt();
		System.out.println("Enter the desired name: ");
		String pname = sc.next();
		
		for (Person obj: al) {
			if (obj.id == pid) {
				obj.name = pname;
			}
		}
		
	}

	
	private static void removeObject(ArrayList<Person> al) {
		System.out.println("Enter ID to remove.");
		int pid = sc.nextInt();
		int pos = 0;
		for (Person obj: al) {
			if (obj.id == pid) {
				pos = al.indexOf(obj);
				System.out.println("---removed...");
			}
		}
		al.remove(pos);
		
	}
	
	
	private static void sortObject(ArrayList<Person> al) {
		SortById srt = new SortById();
		
		Collections.sort(al, srt);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println("ArrayListEg");
		ArrayList<Person> al = new ArrayList<>();
		
		boolean start = true;
		
		do {
			System.out.println("1. Add\n2. Display\n3. Update\n4. Remove\n5. Sort\n6. Stop");
			int choice = sc.nextInt();
			
			switch(choice) {
			case 1:
				addPersonObject(al);
				break;
			case 2:
				dispPersonObject(al);
				break;
			case 3:
				updateObject(al);
				break;
			case 4:
				removeObject(al);
				break;
			case 5:
				sortObject(al);
				break;
			case 6:
				start = false;
				break;
			default:
				System.out.println("Invalid::Choose from given options.");
				break;
			}
		}while(start);
		
		
	}	
	
}




class SortById implements Comparator<Person> {
	
	public int compare(Person p1, Person p2) {
		if (p1.id > p2.id) {
			return 1;
		} else {
			return -1;
		}
	}
	
}





