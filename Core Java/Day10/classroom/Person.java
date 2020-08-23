package classroom;

public class Person extends Object {

	int id;
	String name;
	
	Person(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	void display() {
		System.out.println(id + " " + name);
	}
	
}
