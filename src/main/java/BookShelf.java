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
    static String pages;
    static boolean read;
    static String notes;
    
    static String option; //variable for option selection
    
    //bookshelf array
    static ArrayList<String> titlelist;
    static ArrayList<String> authorlist;
    static ArrayList<String> pagelist;
    static ArrayList<String> noteslist;
    
    public static void main(String[] args){
        
        titlelist = new ArrayList<>();
        authorlist = new ArrayList<>();
        pagelist = new ArrayList<>();
        noteslist = new ArrayList<>();
        
        while(true){
            getMenu(); //get menu method
            
            switch (option) {
                case "1":
                    System.out.println("##### ADDING A BOOK #####");
                    
                    //book name
                    System.out.println("Title: ");
                    title = input.nextLine();
                
                    //book author
                    System.out.println("Author: ");
                    author = input.nextLine();
                
                    //number of pages
                    System.out.println("Pages: ");
                    pages = input.nextLine();
                
                    addBook(title, author, pages);
                    
                    break;
                case "2":
                    System.out.println("##### REMOVING A BOOK ######");
                    
                    //removeBook();
                    break;
                case "3":
                    System.out.println("##### YOUR BOOK LIST #####");
                    
                    //getBooksList();
                    break;
                default:
                    System.out.println("Quitting.....");
                    System.exit(0);
            }
        }//end while
        
    }//end main
    
    public static void addBook(String title, String author, String pages){
        titlelist.add(title);
        authorlist.add(author);
        pagelist.add(pages);
        
        System.out.println(titlelist.get(0) + "\n" + authorlist.get(0) + "\n" + pagelist.get(0));
    }
    
    public static void getBookDetails(String title, String author, String pages){
        //book details code
        System.out.println("##### BOOK DETAILS #####");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
    }
    
    public static void getMenu(){
        System.out.println("Welcome to your book library.");
        System.out.println("1. Add a book. \n"
                + "2. Remove a book. \n"
                + "3. Show all books.");
        System.out.println("Enter your option: ");
        option = input.nextLine();
    }
    
}
