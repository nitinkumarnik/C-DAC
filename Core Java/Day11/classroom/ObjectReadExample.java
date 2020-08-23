package classroom;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ObjectReadExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		
		FileInputStream fis = new FileInputStream("fileobj.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Person obj;
		try {
			while ( (obj = (Person) ois.readObject()) != null) {
				obj.display();
			}
		} catch (EOFException e) {
			System.out.println("File end reached.");
		}
		
		
		
	}
	
	
}
