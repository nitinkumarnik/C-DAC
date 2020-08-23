package classroom;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HashMapExm {

	
	public static void main(String[] args) {
		
		
		HashMap<Integer, String> hm = new HashMap<>();
		
		hm.put(1, "Batman");
		hm.put(2, "Ironman");
		hm.put(3, "Spiderman");
		
		System.out.println(hm.entrySet());
		
		System.out.println(hm);
		
		for ( Map.Entry obj: hm.entrySet() ) {
			System.out.println(obj.getKey() + " " + obj.getValue());
		}
		
		
		Scanner sc = new Scanner(System.in);
		int pid;
		System.out.println("Enter id: ");
		pid = sc.nextInt();
		String value = hm.get(pid);
		System.out.println(value);
		
		System.out.println("Enter id to remove element: ");
		pid = sc.nextInt();
		hm.remove(pid);
		System.out.println(hm);
		
	}
	
}
