import java.util.Scanner;

public interface MyInterface {

	public void Connect();
	
}

class Oracle implements MyInterface {
	
	public void Connect() {
		System.out.println("Oracle connection...");
	}
}

class MongoDb implements MyInterface {
	
	public void Connect() {
		System.out.println("MongoDb connection...");
	}
	
}

class MySQL implements MyInterface {
	
	public void Connect() {
		System.out.println("MySQL connection...");
	}
}


class TestInterface {
	
	static MyInterface createObject(String choice) {
		if (choice.equals("Oracle")) {
			return new Oracle();
		} else if (choice.equals("MongoDb")) {
			return new MongoDb();
		} else if (choice.equals("MySQL")) {
			return new MySQL();
		} else {
			return null;
		}
	}
	
	public static void main(String[] args) {
		
		/*
		 * MyInterface o = new Oracle(); o.Connect();
		 * 
		 * MyInterface m = new MongoDb(); m.Connect();
		 * 
		 * MyInterface s = new MySQL(); s.Connect();
		 * 
		 * MyInterface i = new Oracle(); i.Connect();
		 */
		
		MyInterface i;
		System.out.println("Enter db: ");
		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		i = createObject(choice);
		i.Connect();
		
		sc.close();
				
		
	}
	
}