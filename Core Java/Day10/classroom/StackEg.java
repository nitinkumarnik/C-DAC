package classroom;

import java.util.Stack;

public class StackEg {

	public static void main(String[] args) {
		
		Stack<Integer> s = new Stack<>();
		
		System.out.println(s);
		
		s.push(4);
		System.out.println(s);
		s.push(8);
		System.out.println(s);
		s.push(1);
		System.out.println(s);
		s.pop();
		System.out.println(s);
		int peeks = s.peek();
		System.out.println(peeks);
		int pos = s.search(8);
		System.out.println(pos);
	}
	
	
}
