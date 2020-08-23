
public class Author {

	private String name;
	private String email;
	private char gender;
	
	Author(String name, String email, char gender) {
		this.name = name;
		this.email = email;
		this.gender = gender;
	}
	
	void setEmail() {
		System.out.println("Setting author email...");
		email = email + "@email.com";
	}
	
	String getName( ) {
		return name;
	}
	
	String getEmail() {
		return email;
	}
	
	char getGender() {
		return gender;
	}
	
	
	
}
