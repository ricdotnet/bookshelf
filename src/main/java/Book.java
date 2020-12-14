/**
 * Book.java class
 * @author ricdotnet
 */

import java.util.ArrayList;

public class Book {

    ArrayList<Notes> notes = new ArrayList<Notes>();

    //book insert variables
    String book_title;
    String book_author;
    int book_pages;
    boolean book_read;

    public Book(String book_title, String book_author, int book_pages, boolean book_read, ArrayList<String> notes) {
        this.book_title = book_title;
        this.book_author = book_author;
        this.book_pages = book_pages;
        this.book_read = false; //sets to false by default
    }

    // void addNote(String note) {

    //     Notes new_note = Notes(note);

    //     notes.add(new_note);

    // }

    //override print of book details.
    //in this method i choose how to print the book details.
    //i won't print notes here. will be a separate method
    //the user will be able to add notes based on the book id / book
    @Override
    public String toString() {
        return "Book Title: " + book_title + "\n"
        + "Book Author: " + book_author + "\n"
        + "Nr of Pages: " + book_pages;
    }

} //end main class