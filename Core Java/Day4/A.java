
public class A {

	int i= 5;
	
	void showa() {
		System.out.println("Class A--" + i);
	}
	
	/*
	 * void showb() { System.out.println("Class A--showb"); }
	 */
	
}


class B extends A {
	
	int j=10;
	
	void showb() {
		System.out.println("Class B--" + j);
	}
}


class TestInheritanceAB {
	
	public static void main(String[] args) {
		B b = new B();
		System.out.println("============================");
		b.j = 40;
		b.showb();
		System.out.println("============================");
		b.i = 50;
		b.showa();
		System.out.println("============================");
		/*
		 * A a = new B(); a.showb(); System.out.println("============================");
		 */
		
	}
}
