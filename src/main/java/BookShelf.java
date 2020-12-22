/**
 * BookShelf.java class (main class)
 * @author ricdotnet
 * 
 * this program will use hashmap and arraylist
 * the hashmap will store the main book details as well as an arrylist inside to store book notes
 */

import java.util.HashMap;
import java.util.Scanner;
import java.util.Random;
import java.util.ArrayList;

public class BookShelf {
    
    static Scanner input = new Scanner(System.in); //scanner for user input
    static Random rand = new Random(); //random for random number generator

    //program variables go here
    static String book_id; //stores the book ID
    static String book_title;
    static String book_author;
    static boolean book_read;
    static int book_pages;

    private static HashMap<String, Book> books = new HashMap<>();
    static ArrayList<Notes> notes;
    
    static int option; //variable for option selection
    static boolean on = true; //variable to say the program is ok and being used. when set to false will quit

    //create an array list for for character choosing
    static char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z',
                    'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','W','X','Y','Z'};

    //String methoid to generate a book ID with 5 characters
    //uses a for loop that runs 5 times and each time selects a random character from the array @chars
    public static String generateBookID() {

        String book_id = "";

        //for loop to concatenate 5 characters from @chars array
        for(int i = 0; i < 5; i++) {
            book_id = book_id + chars[rand.nextInt(49)];
        }

        //return the bookID
        return book_id;
    }

    //book title getter
    public static String getBookTitle() {
        System.out.print("Please enter the book title: ");
        input.nextLine();
        book_title = input.nextLine();
        return book_title;
    }
    //book author getter
    public static String getBookAuthor() {
        System.out.print("Please enter the book author: ");
        book_author = input.nextLine();
        return book_author;
    }
    //book nr of pages getter
    public static int getBookPages() {
        System.out.print("How many pages has this book? ");
        book_pages = input.nextInt();
        return book_pages;
    }
    //method to add a new book
    //calls all book getters then adds them as a new object to the hashmap
    //bookID is the key, the remaining is the book details
    public static void addNewBook() {

        book_id = generateBookID(); //generate a book id
        book_title = getBookTitle(); //request the user for the book title
        book_author = getBookAuthor(); //request the user for the book author
        book_pages = getBookPages(); //request the user for the number of pages
        book_read = false;

        //all books inserted will start with read set to false.
        //this means the book hasn't been read yet.
        //to be changed manually by the user
        //book_read = false;
        //already set on the constructor in Book.java

        Book new_book = new Book(book_title, book_author, book_pages, book_read, notes);

        books.put(book_id, new_book); //adds object to the hashmap

    }

    //print all books on the list
    public static void getBooks() {

        int book_number = 1; //this var is to show the book number on the list (ordered list: book 1, book 2, book 3,....)

        //if hashmap size is 0 there are no books stored.
        if(books.size() == 0) {
            System.out.println("There are no books stored yet.");

        //if there are books run the following and print the books.
        } else {
            System.out.println("##### YOUR BOOK LIST #####");
            for(String book:books.keySet()){

                //get read status before printing
                String read_status = "";
                Book read = books.get(book);
                if (read.readStatus() == 0) {
                    read_status = "You have not read this book yet.";
                } else {
                    read_status = "You have already read this book.";
                }

                System.out.println("BOOK: " + book_number);
                System.out.println("Book ID: " + book);
                System.out.println(books.get(book));
                //System.out.println(read_status);
                System.out.println();
                ++book_number;
            } //end for loop

        } //end else statement

    } //end getBooks() method

    //method to check if book exists
    //if yes get the book
    //if not show error message
    public static int getBook(String book_id) {

        if(books.containsKey(book_id)){
            return 1;
        } else {
            return 0;
        }

    } //end book getter method


    //method to add a note to a book
    public static void addBookNote() {

        System.out.print("Please enter the Book ID: ");
        book_id = input.next();

        if(getBook(book_id) == 1) {
            books.get(book_id);
        } else {
            System.out.println("This book does not exist.");
        }

    }

    //mark book as read
    public static void markBookAsRead() {

        System.out.print("Please enter the Book ID: ");
        book_id = input.next();

        if(getBook(book_id) == 1) {
            Book read = books.get(book_id);
            read.markAsRead();
        } else {
            System.out.println("This book does not exist.");
        }
    }
    
    public static void main(String[] args){

        while(on = true) {

            System.out.print("##### MENU #####\n"
                + "1 - Add a new book to your bookshelf.\n"
                + "2 - Show books on your book shelf.\n"
                + "3 - Add a note to a book.\n"
                + "4 - Mark a book as read.\n"
                + "0 - Exit the program.\n"
                + "Option: ");
            option = input.nextInt();
            System.out.println();

            switch(option) {

                //code to add a new book
                case 1:
                    addNewBook();
                    break;

                //code to get all books from the list
                case 2:
                    getBooks();
                    break;

                //code to add a note to a book
                case 3:
                    addBookNote();
                    //addNote();
                    break;

                //code to set the book as read
                case 4:
                    markBookAsRead();
                    break;

                //quit the program when 0 is entered
                case 0:
                    on = false;
                    break;

            }

        }
    
    }
    
}
