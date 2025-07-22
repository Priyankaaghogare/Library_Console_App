package library;

public class Book extends Items {
	
	private String author;

    public Book(int id, String title, String author) {
        super(id, title);
        this.author = author;
    }

    @Override
    public void displayInfo() {
        System.out.println("Book ID: " + id + ", Title: " + title + ", Author: " + author +
                ", Available: " + (isAvailable ? "Yes" : "No"));
    }

}
