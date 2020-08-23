import java.util.Scanner;

public class ExceptionExample1 
{

	public static void main(String[] args) 
	{

		/*int[] n ={10,20,30};
		
		
		for(int ele : n)
		{
			System.out.println(ele);
			
		}
		try {
		
		System.out.println(n[5]);
		}catch(NullPointerException e)
		{
			System.out.println("invalid index ");
		}
		finally
		{
			System.out.println("resource closed");
		}
		System.out.println("rest of the code");*/
		
		/*Scanner s = new Scanner(System.in);
		
		int a,b;
		System.out.println("enter value of a");
		a = s.nextInt();
		System.out.println("enter value of b");
		b = s.nextInt();
		
		try
		{
		int res = a/b;
		
		System.out.println(res);
		}catch(NullPointerException e)
		{
			
			System.out.println(e);
			System.out.println("invalid data");
		}
		
		System.out.println("rest of the code");*/
		
		
		String cname = "CDAC";
		
		     
		    
		    
		try {
			
			cname = null;
			 int n = cname.length();
				
			 
			    System.out.println(n);
			    
			    
			}catch(NullPointerException e)
			{
				System.out.println(e);
			}
			finally
			{
				System.out.println("resource closed");
			}
			System.out.println("rest of the code");
		
		
		
	}
		
	
		
		
	}
	

