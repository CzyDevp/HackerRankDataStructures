package UnderGradAssignments;
import java.util.Scanner;
public class Assignment1 {
    static int countValidity=0,countBeforeExit=0;
    static Scanner scanner = new Scanner(System.in);
    static String inputPassword;
    static final String password = "password";
    static Book[] books;
    public static void main(String[] args){
        int maxStoreCapacity;
        Book book = new Book("C++","Nav",55.0,345167);
        Book book1 = new Book("C++","Nav",50.0,345167);
        System.out.println("Book info: "+ book.toString());
        System.out.println("Book info: "+ book1.toString());
        System.out.println("Number of Objects so far: "+ Book.getNumberOfObjects());
        System.out.println(book1.equals(book));
        System.out.println("Welcome to BookStore");
        System.out.println("Enter the Max Number of Books you want to have in Inventory");
        maxStoreCapacity = scanner.nextInt();
        books = new Book[maxStoreCapacity];
        System.out.println("Size is: "+ books.length);
        books[0]= book;books[1]=book1;
        //System.out.println("Book Size: "+books.size());
       // books.add(3,book);
        showMenu();
    }
    public static void showMenu(){
        int choice;
        System.out.println("What do you want to do?"+"\n1. Enter new books (password required)" +
                "\n2. Change information of a book (password required)"+
                "\n3. Display all books by a specific author"+
                "\n4. Display all books under a certain a price."+
                "\n5. Quit");
        System.out.println("Please enter your choice >");
        choice = scanner.nextInt();
        processChoice(choice);
    }
    public static void processChoice(int choice){
        switch (choice){
            case 1:{
                if(promptForPassword()) System.out.println("Go ahead add books...!!");
                break;
            }
            case 2:{
                promptForPassword();
                break;
            }
        }
    }
    public static boolean promptForPassword(){
        System.out.println("Enter your Password");
        inputPassword = scanner.next();
        if (inputPassword.equalsIgnoreCase(password)){
            System.out.println("Successful login");
            return true;
        }
        else {
            countValidity++;
            if(countValidity<3) promptForPassword();
            else{
                countValidity=0;
                countBeforeExit++;
                if (countBeforeExit<4)showMenu();
                else{
                    System.out.println("Program detected suspicious activities and will terminate immediately!");
                    System.exit(0);
                    return false;
                }
            }
        }
        return false;
    }
}
class Book{
    static int objectCount=0;
    String title,author;
    long isbn;
    double price;
    Book(String title, String author, double price, long isbn) {
        objectCount++;
        this.title = title;
        this.author = author;
        this.price = price;
        this.isbn = isbn;
    }
    public static int getNumberOfObjects(){
        return objectCount;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public long getIsbn() {
        return isbn;
    }
    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Book)) return false;
        if(obj==this) return true;
        Book book = (Book) obj;
        if(this.isbn==book.isbn && this.price==book.price) return true;
        return false;
    }
    @Override
    public String toString() {
        return "{Name: "+ this.title+" Author: "+this.author+" ISBN: "+this.isbn+" Price: "+ this.price+"}";
    }
}
/*
    int numBooks;
    System.out.println("Enter Number of books that you want to add");
            numBooks = scanner.nextInt();
            if(books.length<numBooks){
                System.out.println("Sorry you cannot add that many books"+
                        "You can only add "+(books.length));
            }
            else{
                System.out.println("Go ahead... to add!!");
            }
 */