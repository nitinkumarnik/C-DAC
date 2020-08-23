
public class Book {

	private String bookname;
	private Author athr;
	private double price;
	private int qty;
	
	Book(String bookname, Author athr, double price, int qty) {
		this.bookname = bookname;
		this.athr = athr;
		this.price = price;
		this.qty = qty;
	}
	
	void setPrice(double price) {
		System.out.println("Updating price...");
		this.price = price;
	}
	
	void setQty(int qty) {
		System.out.println("Updating qty...");
		this.qty = qty;
	}
	
	String getBookName() {
		return bookname;
	}
	
	double getPrice() {
		return price;
	}
	
	int getQty() {
		return qty;
	}
	
	void display() {
		System.out.println(bookname + " by " + athr.getName() + " at " + athr.getEmail());
	}
	
}


class BookAuthor {
	
	public static void main(String[] args) {
		
		Author a = new Author("Ashwin Sanghi", "sanghiashwin", 'm');
		
		Book b = new Book("Chankya's Chant", a, 230.99, 4);
		a.setEmail();
		b.display();
		
	}
}