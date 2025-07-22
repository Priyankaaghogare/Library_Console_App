package library;

public class Main {
	public static void main(String[] args) {
        Items book1 = new Book(1, "Java Fundamentals", "James Gosling");
        Items book2 = new Book(2, "Object-Oriented Design", "Grady Booch");
        Items book3 = new Book(3,  "Object-Oriented Programming ", "James Oek");
        Items book4 = new Book(4, "Problem Solving Fundamentals", "Chris Jorden");
        

        Member member1 = new Member(101, "Alice");
        Member member2 = new Member(102, "Bob");
      //  Member member3 = new Member(104, "MArrie");
        

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();
        book4.displayInfo();
        

        member1.borrowItem(book3);
        System.out.println("____________________________________________________________________");
        member2.borrowItem(book3);  // should be unavailable
        System.out.println("____________________________________________________________________");
        member1.returnItem(book3);
        System.out.println("____________________________________________________________________");
        member2.borrowItem(book3);  // now available
        System.out.println("____________________________________________________________________");
        
  
      // Status of book
        book3.displayInfo();
    }
}
