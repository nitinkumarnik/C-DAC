
public class Student {

	int sid;
	String name;
	float amountPaid;
	
	Student() {
		System.out.println("No argument constructor.");
		sid = 103;
		name = "Wonder Woman";
		amountPaid = 60000;
	}
	
	Student(int sid, String name, float amountPaid) {
		System.out.println("Parameterised constructor.");
		this.sid = sid;
		this.name = name;
		this.amountPaid = amountPaid;
	}
	
	Student(Student obj) {
		System.out.println("Copy Constructor.");
		sid = obj.sid;
		name = obj.name;
		amountPaid = obj.amountPaid;
	}
	
	
	void displayStudent() {
		System.out.println("Display Student...");
		System.out.println("SID: " + sid);
		System.out.println("Name: " + name);
		System.out.println("Fee paid: " + amountPaid);
	}
	
	void objectModify(Student obj) {
		System.out.println("Modifying object...");
		obj.sid = 105;
		obj.name = "Spiderman";
		amountPaid = 34000;
	}
	
	
	
	
	public static void main(String[] args) {
		
		Student s1 = new Student(101, "Batman", 40000);
		Student s2 = new Student(102, "Ironman", 50000);
		
		Student s3 = new Student();
		
		Student s4 = new Student(s3);
		
		System.out.println("============1================");
		s1.displayStudent();
		System.out.println("============2================");
		s2.displayStudent();
		System.out.println("============3================");
		s3.displayStudent();
		System.out.println("============4================");
		s4.displayStudent();
		System.out.println("============5================");
		s4.objectModify(s4);
		s4.displayStudent();
	}
	
	
	
}
