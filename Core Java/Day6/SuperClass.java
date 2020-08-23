
public class SuperClass {

	void print() {
		System.out.println("super class print");
	}
	
	void show() {
		System.out.println("super class show method");
	}
	
}


class SubClass extends SuperClass {
	
	void show() {
		super.show();
		System.out.println("sub class show method");
	}
}


class TestOverriding {
	
	public static void main(String[] args) {
		SubClass s = new SubClass();
		
		s.show();
	}
	
}
