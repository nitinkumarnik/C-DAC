
public class EmployeeA {

	int id;
	String name;
	float sal;
	Address add;
	
	EmployeeA(int id, String name, float sal, Address add) {
		this.id = id;
		this.name = name;
		this.sal = sal;
		this.add = add;
	}
	
	void disp() {
		
		System.out.println(id + " " + name + " " + sal);
		System.out.println(add.city + " " + add.state + " " + add.pin);
		
	}
	
	
	
	public static void main(String[] args) {
		
		Address a = new Address("Delhi", "New Delhi", 110044);
		EmployeeA e = new EmployeeA(101, "NiK", 150000, a);
		e.disp();
		
	}

	
	
	
	
}
