package classroom;

import java.util.LinkedList;

public class LinkedListEg {

	
	public static void main(String[] args) {
		
		LinkedList<Integer> ll = new LinkedList<>();
		
		ll.add(3);
		ll.add(5);
		ll.add(1);
		ll.add(8);
		
		System.out.println(ll);
		ll.addFirst(9);
		System.out.println(ll);
		ll.addLast(4);
		System.out.println(ll);
		ll.add(1, 89);
		System.out.println(ll);
		ll.set(2, 32);
		System.out.println(ll);
		
		
	}
	
	
}
