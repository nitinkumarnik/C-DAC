/*
* Class Note
* Typed By Sir.
*
*/


import java.util.Scanner;

public  class Employee 
{
	// instance variable
	
    int empno;
    String ename;
    float sal;
    
    
    
   
    //instance method /non static method
    
    void setEmpDetails()
    {
    	 Scanner s = new Scanner(System.in);
 		
 		System.out.println("enter the empdetails details");
 		empno = s.nextInt();
 		ename = s.next();
 		sal = s.nextFloat();
    	
    }
    
    void findTax()
    {
        float tax;
    	tax = sal *0.2f;
    	System.out.println(tax);
    	
    	
    }
    void dispEmpDetails()
    {
    	   	
    	System.out.println(empno);
    	System.out.println(ename);
    	System.out.println(sal);
    	
    }
   
    
    
    public static void main(String[] args) 
 	{
 	    
	   Employee  e1 = new Employee();
	   Employee  e2 = new Employee();
	   Employee  e3 = new Employee();
	 
	  
	  /* e1.empno = 1001;
	   e1.ename = "shan";
	   e1.sal = 4000;
	 
	   
	   e2.empno = 1002;
	   e2.ename = "binu";
	   e2.sal = 20000;
	   
	   e3.empno = 1003;
	   e3.ename = "siju";
	   e3.sal = 50000;*/
			 
	   
		
	      
	   e1.setEmpDetails();
	  
		
	   e2.setEmpDetails();
	   	
	   e3.setEmpDetails();
	   
	   e1.findTax();
	   e1.dispEmpDetails();
	   
	   e2.findTax();
	   e2.dispEmpDetails();
	   e3.findTax();
	   e3.dispEmpDetails();
	   
	   
	   
	  /* System.out.println("emp1 details");
	   System.out.println(e1.empno);
	   System.out.println(e1.ename);
	   System.out.println(e1.sal);
	   
	   System.out.println("emp2 details");
	   System.out.println(e2.empno);
	   System.out.println(e2.ename);
	   System.out.println(e2.sal);*/
	 
	   
	   
 		
 	}
    
    
}
    


  











