package classroom;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HMapExm {

	
	public static void main(String[] args) {
		
		
		HashMap<Integer, Person> hmo = new HashMap<>();
		
		Person p1 = new Person(101, "Ironman");
		Person p2 = new Person(102, "Batman");
		Person p3 = new Person(103, "Wonder Woman");
		
		hmo.put(1, p1);
		hmo.put(2, p2);
		hmo.put(3, p3);
		hmo.put(4, new Person(105, "Kaptaan America"));
		
//		System.out.println(hmo);
		
		for (Map.Entry obj: hmo.entrySet()) {
//			System.out.println((Person) obj.getValue());
			Person p = (Person) obj.getValue();
			p.display();
		}
		
		Scanner sc = new Scanner(System.in);
		
	
//		int pid;
//		System.out.println("enter key");
//		
//		pid = sc.nextInt();
//		
//		Person obj=hmo.get(pid);
//		obj.display();
		
		
		System.out.println("Enter an id: ");
		int show = sc.nextInt();
		System.out.println(show);
		Person obj1 = hmo.get(103);
		obj1.display();
		
		
		
		
		
		
		
		
		
	}
	
	
}
