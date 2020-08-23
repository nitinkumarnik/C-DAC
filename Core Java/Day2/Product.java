/*
* Class Note
* Typed By Sir.
*
*/

import java.lang.*;
import java.util.Scanner;
public class Product 

{
// how to read data from user
	
	
	public  static float calculateDiscount(float price)
	{
	   float dis = price*0.1f;  
	  // System.out.println("product discount"+dis);
	   return dis;
		
	}
	
	
	public static void displayProductDetails(int pid,String pname,float price)
	{
		System.out.println(" inside disp method product details");
		
		//System.out.println("product details");
		System.out.println("product id = " +pid);
		System.out.println("product name = "+pname);
		System.out.println("product price = "+price);
		
		
		
	}
	
	
	
	
	public static void main(String[] args) 
	{
	
		int pid=1001;
		String pname="HP";
		float price=30000;
			
		//class will contain methods
		//create object of that class
		//using the reference you can access the non static method
		//read using scanner class
		
		Scanner s = new Scanner(System.in);
	
		System.out.println("enter the product details");
		pid = s.nextInt();
		pname = s.next();
		price = s.nextFloat();
		
				
		displayProductDetails(pid,pname,price);
		
        float dis=calculateDiscount(price);
        
        System.out.println("product discount"+dis);
		//command line arguments
		
//		System.out.println("product details");
//		System.out.println(args[0]);
//		System.out.println(args[1]);
//		System.out.println(args[2]);
//		float dis = Integer.parseInt(args[2])*0.1f;
//		System.out.println(dis);
		
		
		//how to use user defined methods
		
		
		
		
	}




	
	
	
	
	
}
