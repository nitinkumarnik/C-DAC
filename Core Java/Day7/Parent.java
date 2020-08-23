
public abstract class Parent {

	abstract public void m2();
	
	void print() {
		System.out.println("Parent Class.");
	}
	
}

class Child extends Parent {
	
	public void m2() {
		System.out.println("m2 in Child Class.");
	}
	
	void print() {
		// super.print();;
		System.out.println("Child Class.");
	}
	
	public static void main(String[] args) {
		
		Child c = new Child();
		c.print();
		c.m2();
		
	}
	
}


