package classroom;


import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class ObjectWriteExample {

	public static void main(String[] args) throws IOException {
		
		Person p1 = new Person(101, "Ironman", 54444);
		Person p2 = new Person(102, "Batman", 64444);
		Person p3 = new Person(103, "Wonder Woman", 60000);
		
		FileOutputStream fos = new FileOutputStream("fileobj.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
	
		oos.writeObject(p1);
		oos.writeObject(p2);
		oos.writeObject(p3);
		
		oos.close();
		
		System.out.println("Object write is over.");
		
		
		
	}
	
	
	
}
