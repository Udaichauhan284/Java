package in.challengeInheritance;

public class LibraryItem {
    private int itemID;
    private String title;
    private String author;

    public void checkOut(){
        System.out.println("Book is CheckOut");
    }
    public void returnItem(){
        System.out.println("Item is returned");
    }
}
