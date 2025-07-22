package library;

public  abstract class Items {
	
	protected int id;
	protected String title;
	protected boolean isAvailable;
	
	public Items(int id, String title) {
		
		this.id=id;
		this.title=title;
		isAvailable=true;
		
	}
	public boolean isAvailable() {
        return isAvailable;
    }

    public void markBorrowed() {
        isAvailable = false;
    }

    public void markReturned() {
        isAvailable = true;
    }

    public abstract void displayInfo();

}
