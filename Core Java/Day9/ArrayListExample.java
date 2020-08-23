import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample {

	public static void main(String[] args) {
		
		// Creating ArrayList.
		ArrayList<Integer> al = new ArrayList<>();
		
		// Adding object in ArrayList
		al.add(7);
		al.add(8);
		al.add(3);
		al.add(4);
		al.add(8);
		
		/*
		 * for (int ele : al) { System.out.print(ele + " "); }
		 */
		
		// Iterator
		
		Iterator it = al.iterator();
		
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
		
		
		
		
		ArrayList<String> alstr = new ArrayList<>();
		
		alstr.add("Batman");
		alstr.add("Ironman");
		alstr.add("WonderWoman");
		alstr.add("Spiderman");
		alstr.add("Shaktiman");
		
		alstr.remove(3);
		
		for (String ele: alstr) {
			System.out.println(ele);
		}
		
		
	}
	
	
}
