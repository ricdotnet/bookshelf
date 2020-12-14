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

    //static Book books; //create object from Book.java


    //program variables go here
    static String book_id;
    static String book_title;
    static String book_author;
    static boolean book_read;
    static int book_pages;

    private static HashMap<String, Book> books = new HashMap<>();
    static ArrayList<Notes> notes;
    
    static int option; //variable for option selection

    //create an array list for for character choosing
    static char[] chars = {'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','w','x','y','z',
                    'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','W','X','Y','Z'};

    //String methoid to generate a book ID with 5 characters
    //uses a for loop that runs 5 times and each time selects a random character from the array @chars
    public static String generateBookID() {

        String bookID = ""; //initiate bookID String

        //for loop to concatenate 5 characters from @chars array
        for(int i = 0; i < 5; i++) {
            bookID = bookID + chars[rand.nextInt(49)];
        }

        //return the bookID
        return bookID;
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

        book_id = generateBookID();
        book_title = getBookTitle();
        book_author = getBookAuthor();
        book_pages = getBookPages();

        Book new_book = new Book(book_title, book_author, book_pages, book_read, notes);

        books.put(book_id, new_book);

    }

    //print all books on the list
    public static void getBooks() {

        if(books.size() == 0) {
            System.out.println("There are no books stored yet.");
        } else {
            for(String book:books.keySet()){
                System.out.println("Book ID: " + book);
                System.out.print(books.get(book));
            }
        }

    }
    
    public static void main(String[] args){

        boolean on = true;
        while(on = true) {

            System.out.println("##### MENU #####\n"
                + "1 - add a new book\n"
                + "2 - show books\n"
                + "option: ");
            option = input.nextInt();

            switch(option) {
                case 1:
                    addNewBook();
                    break;
                case 2:
                    getBooks();
                    break;
                case 3:
                    on = false;
                    break;
            }

        }
    
    }
    
}
