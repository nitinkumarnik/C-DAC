package HashMapQues;

public class Book {

	String name;
	float price;
	String authorName;
	int isbnNo;
	String publication;
	
	
	
	Book(String name, float price, String authorName, int isbnNo, String publication) {
		this.name = name;
		this.price = price;
		this.authorName = authorName;
		this.isbnNo = isbnNo;
		this.publication = publication;
	}



	void display() {
		System.out.println(name + " | Price: " + price + " | Author: " + authorName+ " | isbn: " + isbnNo + " | " + publication);
		
	}
	
	public String toString() {
		return name + " | Price: " + price + " | Author: " + authorName+ " | isbn: " + isbnNo + " | " + publication;
	}
	
}
