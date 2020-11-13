package singletonDesign;

public class SingleObject2 {

	   //create an object of SingleObject
	   private static SingleObject2 instance = null;

	   //make the constructor private so that this class cannot be
	   //instantiated
	   private SingleObject2(){}

	   //Get the only object available
	   public static SingleObject2 getInstance(){
	       if(instance==null) {
	    	   synchronized (SingleObject2.class) {
				instance=new SingleObject2();
			}
	       }
		   return instance;
	   }

	   public void showMessage(){
	      System.out.println("Hello2 Hello2 Hello2!");
	   }
	}