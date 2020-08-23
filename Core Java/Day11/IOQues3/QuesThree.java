package IOQues3;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class QuesThree {

	public static void main(String[] args) throws Exception {
		
		// ********** Writing.
		int [] marks = {43, 65, 23, 65, 76};;
		String[] subject = {"Eng", "Phy", "Chem", "Maths", "Bio"};
		Student s1 = new Student(101, "Batman", marks, subject);
		marks  = new int[]{89, 45, 87, 45, 36};
		Student s2 = new Student(102, "Ironman", marks, subject);
		marks  = new int[]{45, 78, 35, 45, 36};
		Student s3 = new Student(103, "Wonder Woman", marks, subject);
		marks  = new int[]{54, 65, 78, 65, 98};
		Student s4 = new Student(104, "Joker", marks, subject);
		marks  = new int[]{9, 5, 6, 57, 87};
		Student s5 = new Student(105, "Spiderman", marks, subject);
	
		FileOutputStream fos = new FileOutputStream("objques.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(s1);
		oos.writeObject(s2);
		oos.writeObject(s3);
		oos.writeObject(s4);
		oos.writeObject(s5);
		
		oos.close();
		fos.close();
		
		System.out.println("Object writing to file... Done.");
		
		// ********** Reading.
		
		FileInputStream fis = new FileInputStream("objques.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		System.out.println("Reading Objects...");
		Student stobj;
		
		try {
			while ( (stobj = (Student) ois.readObject()) != null ) {
				stobj.display();
				stobj.result();
				System.out.println("-------------------------------");
			}
		} catch (EOFException e) {
			System.out.println("End of File.");
		}
		
		System.out.println("Reading Objects... Done.");
		fis.close();
		ois.close();
		
	}
	
	
}
