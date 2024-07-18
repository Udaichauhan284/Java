public class BookClass {
    static int totalNumBooks;
    static{ //static block, run once, when claas is loaded
        totalNumBooks = 0;
    }
    { //initialization block, run each time, when object is created
        totalNumBooks++;
    }
    String author;
    String title;
    String bookNum;
    boolean isBorrowed = false;

    //constructor
    BookClass(String author, String title, String bookNum){
        this.author = author;
        this.title = title;
        this.bookNum = bookNum;
    }
    BookClass(String bookNum){
        this(bookNum, "unknown", "unknown");
    }

    static int getTotalBooks(){
        return totalNumBooks;
    }

    public void borrowBook(){
        if(!isBorrowed){
            this.isBorrowed = true;
            System.out.println("Enjoy Your Book");
        }else{
            System.out.println("Book Is Already Borrowed");
        }
    }

    public void returnBook(){
        if(isBorrowed){ //true, then make it false and return the book
            this.isBorrowed = false;
            System.out.println("Book returned Successfully");
        }else{
            System.out.println("Book already Returned");
        }
    }

    public static void main(String[] args){
        BookClass book1 = new BookClass("1", "Book1", "Author1");
        BookClass book2 = new BookClass("2","Book2", "Author2");
        System.out.println("The Total Books in Store " + BookClass.getTotalBooks());
        book1.borrowBook();
        book2.borrowBook();
        book1.borrowBook();
        book2.returnBook();
        book2.returnBook();
    }

}
