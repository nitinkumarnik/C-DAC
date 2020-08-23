
public class AnimalUpcasting {

	void eat() {
		System.out.println("Animal is eating...");
	}
	
}

class Dog extends AnimalUpcasting {
	
	void eat() {
		System.out.println("Dog is eating...");
	}
}


class BabyDog extends Dog {
	
	public static void main(String[] args) {
		AnimalUpcasting d = new BabyDog();
		d.eat();
	}
}
