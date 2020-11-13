//Class-level Member (Eager Initialization Method)
package singletonDesign;

public class SingletonPatternDemo {
	   public static void main(String[] args) {

	      //illegal construct
	      //Compile Time Error: The constructor SingleObject() is not visible
	      //SingleObject object = new SingleObject();

	      
	      //SingleObject object = SingleObject.getInstance();
	      SingleObject2 object = SingleObject2.getInstance();

	      //show the message
	      object.showMessage();
	   }
	}