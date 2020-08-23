package IOQues3;

import java.io.Serializable;
import java.util.Arrays;

public class Student implements Serializable {

	int id;
	String name;
	int[] marks;
	String[] subject;
	
	Student(int id, String name,int[] marks, String[] subject) {
		this.id = id;
		this.name = name;
		this.marks = marks;
		this.subject = subject;
	}
	
	void result() {
		float sum = 0;
		for (int i=0; i<5; i++) {
			sum += marks[i];
		}
		System.out.println("Result: " + (sum/5.0) );
	}
	
	void sortOnMarks() {
		
	}
	
	void display() {
		System.out.println("Id: "+id);
		System.out.println("Name: "+name);
		System.out.println("Marks: "+ Arrays.toString(marks));
		System.out.println("subject: "+ Arrays.toString(subject) );
		
	}
	
}
