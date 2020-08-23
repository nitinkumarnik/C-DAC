
public class Person {
	
	String name;
	int age;
	
	Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
}


class Teacher extends Person {
	
	Teacher(String name, int age) {
		super(name, age);
	}
	
	void myProfession() {
		System.out.println(name);
		System.out.println("You are a Teacher.");
	}
	
}

class Emp extends Person {
	
	Emp(String name, int age) {
		super(name, age);
	}
	
	void myProfession() {
		System.out.println(name);
		System.out.println("You are an Employee.");
	}
}

class PerEmp extends Emp {
	
	PerEmp(String name, int age) {
		super(name, age);
	}
	
	void myProfession() {
		System.out.println(name);
		System.out.println("You are a Permanent Employee.");
	}
}

class ConEmp extends Emp {
	
	ConEmp(String name, int age) {
		super(name, age);
	}
	
	void myProfession() {
		System.out.println(name);
		System.out.println("You are a Contract Employee.");
	}
	
}


class PersonInheritance {
	
	public static void main(String[] args) {
		
		System.out.println("======== Person obj ================");
		Person p = new Person("Berlin", 34);
		
		System.out.println("======== Teacher obj ================");
		Teacher t = new Teacher("Nairobi", 26);
		t.myProfession();
		
		System.out.println("======== Emp obj ================");
		Emp e = new Emp("Denver", 28);
		e.myProfession();
		
		System.out.println("======== PerEmp obj ================");
		PerEmp pe = new PerEmp("Professor", 31);
		pe.myProfession();
		
		System.out.println("======== ConEmp obj ================");
		ConEmp ce = new ConEmp("Moscow", 40);
		ce.myProfession();
		
	}
	
}
