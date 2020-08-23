
public class Employee {
	
	int id;
	String name;
	
	Employee(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	
	void showEmployee() {
		
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		
	}

}


class HourlyEmployee extends Employee {
	
	int noOfHours;
	int rate;
	int salary;
	
	HourlyEmployee(int id, String name, int noOfHours, int rate) {
		super(id, name);
		this.rate = rate;
		this.noOfHours = noOfHours;
		
		computeSalary(noOfHours);
	}
	
	void computeSalary(int noOfHours) {
		salary = noOfHours * rate;
	}
	
	void showSalary() {
		System.out.println(name + " works for " + noOfHours + "hours, and salary is " + salary + " rupees.");
	}
	
	void showSalary(int noOfHours) {
		
		computeSalary(noOfHours);
		
		System.out.println(name + " works for " + noOfHours + "hours, and salary is " + salary + " rupees.");
	}
}

class SalariedEmployee extends Employee {
	
	int salary = 135000;
	
	SalariedEmployee(int id, String name) {
		super(id, name);
	}
	
	void setSalary(int salary) {
		System.out.println("Setting salary...");
		this.salary = salary;
	}
	
	void showSalary() {
		System.out.println("Name: " + name);
		System.out.println("Salary: " + salary);
	}
}


class Company {
	
	public static void main(String[] args) {
	
		HourlyEmployee he1 = new HourlyEmployee(101, "Bahubali", 8, 250);
		
		he1.showEmployee();
		he1.showSalary();
		he1.showSalary(5);
		
		SalariedEmployee se1 = new SalariedEmployee(102, "Katapa");
		se1.showEmployee();
		se1.showSalary();
		se1.setSalary(150000);
		se1.showSalary();
		
	}
}