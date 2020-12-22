/**
 * Book.java class
 * @author ricdotnet
 */

import java.util.ArrayList;

public class Book {

    ArrayList<Notes> notes;

    //book insert variables
    String book_title;
    String book_author;
    int book_pages;
    boolean book_read;

    public Book(String book_title, String book_author, int book_pages, boolean book_read, ArrayList<Notes> notes) {
        this.book_title = book_title;
        this.book_author = book_author;
        this.book_pages = book_pages;
    }

    //call this method in BookShelf.java to add a note refering to a certain book
    void addNote(String note) {
        Notes new_note = new Notes(note); //create object from Notes.java

        //add note into notes arraylist
        //because the array list is embedded in the constructor
        //the note will be added to the correcponding book
        notes.add(new_note);
    }

    //return read status of a book
    //1 is read 0 is not read
    int readStatus() {
        if(book_read = false) {
            return 0;
        } else {
            return 1;
        }
    }
    //set book as read
    void markAsRead() {
        this.book_read = true;

        System.out.println("marked as read.");
    }

    // override print of book details.
    //in this method i choose how to print the book details.
    //i won't print notes here. will be a separate method
    //the user will be able to add notes based on the book id / book
    @Override
    public String toString() {
        return "Book Title: " + book_title + "\n"
        + "Book Author: " + book_author + "\n"
        + "Nr of Pages: " + book_pages + "\n"
        + book_read;
    }

} //end main class