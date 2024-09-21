package week1.assignment;

public class Library {

	public static void main(String[] args) {
		
		Library lib = new Library();
		lib.addBook("Selenium & Java");
		lib.issueBook();

	}
	
	public void addBook(String bookTitle) {
		
		System.out.println(bookTitle+ " Book added successfully");
		
		return;
		
	}
	
	public void issueBook() {
		
		System.out.println("Book issued successfully");
	}

}
