/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.*;

/**
 *
 * @author ricardorocha
 */
public class BookShelf {
    
    static Scanner input = new Scanner(System.in);
    
    //book details
    static String title;
    static String author;
    static int pages;
    static boolean read;
    static String notes;
    
    //bookshelf array
    static ArrayList<String> bookshelf;
    static ArrayList<String> noteslist;
    
    public static void main(String[] args){
        
        bookshelf = new ArrayList<String>();
        noteslist = new ArrayList<String>();
        
        System.out.println("##### ADDING A BOOK #####");
        
        //book name
        System.out.println("Title: ");
        title = input.next();
        
        //book author
        System.out.println("Author: ");
        author = input.next();
        
        //number of pages
        System.out.println("Pages: ");
        pages = input.nextInt();
        
        addBook(title, author, pages);
        
        //getBookDetails(title, author, pages);
        
    }
    
    public static void addBook(String title, String author, int pages){
        bookshelf.add(title);
        
        System.out.println(bookshelf.get(0));
    }
    
    public static void getBookDetails(String title, String author, int pages){
        //book details code
        System.out.println("##### BOOK DETAILS #####");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    
}
