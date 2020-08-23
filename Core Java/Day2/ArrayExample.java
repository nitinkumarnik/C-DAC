/*
* Class Note
* Typed By Sir.
*
*/
public class ArrayExample
{

	
	public static int findtotal(int[] mark)
	{
		int tot=0;
		for(int i = 0;i<5;i++)
		{ 
			tot = tot+mark[i];
			
		}

		return tot;
		
	}
	
	public static void main(String[] args) 
	{
	
		int[] n = new int[5];
		
		int val = 10;
		for(int i = 0;i<5;i++)
		{
			n[i]= val;
			val = val+10;
		}
		
		System.out.println("element in the number array is");
		for(int i = 0;i<5;i++)
		{
			System.out.println(n[i]);
		}
		
		int[] mark = {50,60,80,90,100};
		
		
		System.out.println("element in the mark array is");
		
		for(int i = 0;i<mark.length;i++)
		{
			System.out.println("mark"+ i +" " +mark[i]);
		}
		
		
		int tot =findtotal(mark);
		System.out.println("total marks "+ tot);
		
		//iterate through for each
		
		String[] sub = { "c++","dbt","java","python"};
		System.out.println("iterating through for each");
		
		for(String ele : sub)
		{
			System.out.println(ele);
		}		
	}
}
