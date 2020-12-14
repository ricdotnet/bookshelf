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

public class BookShelf {
    
    static Scanner input = new Scanner(System.in); //scanner for user input
    static Random rand = new Random(); //random for random number generator

    //static Book books = new Book(); //create object from Book.java
    
    static String option; //variable for option selection

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


    public static void addNewBook() {
        
    }
    
    public static void main(String[] args){
    
    }
    
}
