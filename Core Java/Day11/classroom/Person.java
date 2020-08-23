package classroom;

import java.io.Serializable;

public class Person implements Serializable {

	int id;
	String name;
	float sal;
	
	Person(int id, String name, float sal) {
		this.id = id;
		this.name = name;
		this.sal = sal;
	}
	
	void display() {
		System.out.println(id + " " + name + " " + sal);
	}
	
}