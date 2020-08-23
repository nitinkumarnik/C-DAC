import java.util.Scanner;

public class Emp {
	
	// instance variables
	int empno;
	String empname;
	String designation;
	String dept;
	float salary;
	
	// instance method
	void readEmpData() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter details of Employee: ");
		System.out.print("Emp No.: ");
		empno = scan.nextInt();
		scan.nextLine();
		System.out.print("Name: ");
		empname = scan.nextLine();
		System.out.print("Designation: ");
		designation = scan.nextLine();
		System.out.print("Dept: ");
		dept = scan.nextLine();
		System.out.print("Salary: ");
		salary = scan.nextFloat();
		

	}
	
	void displayEmpData() {
		System.out.println("Showing details of Employee: ");
		System.out.println("Emp No.: " + empno);
		System.out.println("Name: " + empname);
		System.out.println("Designation: " + designation);
		System.out.println("Dept: " + dept);
		System.out.println("Salary: " + salary);
	}
	
	
	// main method
	public static void main(String[] args) {
		
		// creating object
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		
		e1.readEmpData();
		e2.readEmpData();
		
		e1.displayEmpData();
		e2.displayEmpData();
		

		
	}

}
