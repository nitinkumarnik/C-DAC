import java.util.Scanner;

public class Student {
	
	int id;
	String name;
	int[] mark = new int[5];
	float result;
	
	void setStudent() {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter student details: ");
		System.out.println("ID: ");
		id = scan.nextInt();
		
		System.out.println("Name: ");
		name = scan.next();
		System.out.println("Enter 5 subjects marks: ");
		for (int i=0; i<5; i++) {
			mark[i] = scan.nextInt();
		}
		
	}
	
	void getResult() {
		for (int i=0; i<mark.length; i++) {
			result += mark[i];
		}
		System.out.println("Result: " + (result/5.0));
	}
	
	void getStudent() {
		System.out.println("Name: " + name);
		getResult();
	}
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student();
		
		s1.setStudent();
		s1.getStudent();
		
	}
	
	
}
