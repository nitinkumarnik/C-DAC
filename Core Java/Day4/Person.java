
public class Person {

	int id;
	String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void displayPerson() {
		System.out.println(id);
		System.out.println(name);
	}
	
}

class StudentX extends Person {
	int marks;
	
	StudentX(int id, String name, int marks) {
		super(id, name);
		this.marks = marks;
	}
	
	void result() {
		String result;
		
		if (marks > 35) {
			result = "Pass.";
		} else {
			result = "Fail.";
		}
		
		System.out.println(marks + " : " + result);
		
	}
}


class PersonInheritance {
	
	public static void main(String[] args) {
		StudentX s = new StudentX(23, "Hulk", 45);
		s.displayPerson();
		s.result();
	}
	
}


