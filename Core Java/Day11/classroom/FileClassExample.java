package classroom;

import java.io.File;
import java.io.IOException;

public class FileClassExample {

	public static void main(String[] args) throws IOException {
		
		File f = new File("hello.txt");
		f.createNewFile();
		
		System.out.println(f);
		
		System.out.println(f.canRead());
		
	}
	
	
}
