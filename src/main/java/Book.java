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

    void addNote() {

        String note = "kshvnsndvsl;dkmnv";

        Notes new_note = Notes(note, 15);

        notes.add(new_note);

    }

} //end main class