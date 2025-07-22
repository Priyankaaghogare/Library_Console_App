package library;

public class Member {
	

	private int id;
    private String name;

    public Member(int id, String name) {
        this.id =id;
        this.name = name;
    }

    public void borrowItem(Items item) {
        if (item.isAvailable()) {
            item.markBorrowed();
            System.out.println(name + " borrowed: " + item.title);
        } else {
            System.out.println("Sorry, " + item.title + " is currently not available.");
        }
        
   
    }

    public void returnItem(Items item) {
        item.markReturned();
        System.out.println(name + " returned: " + item.title);
    }

}
