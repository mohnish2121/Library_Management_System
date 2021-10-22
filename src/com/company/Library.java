package com.company;

import java.util.HashMap;

public class Library {
    HashMap<String, Integer> books = new HashMap<>();
    Library() {
        books.put("python" , 1 );
        books.put("java", 1 );
        books.put( "sql" , 1 );
        books.put( "mongo", 1 );
        books.put( "html", 1 );
        books.put( "js" , 1 );
        books.put( "react" , 1 );

    }
    void addNewBook( String newBook  ) {

        if( books.containsKey(newBook) ) books.put( newBook , books.get(newBook) +1 );
        else books.put( newBook , 1);
        System.out.println("New Book added ");
    }
    void issueBook( String newBook  ) {
//        Book newBook = new Book(bookName, id);

        if( books.containsKey(newBook) && books.get(newBook) > 0 ) {
            books.put(newBook , books.get(newBook) -1 );
            System.out.println("Book issued ");
        }
        else {
            System.out.println("Book is not available ");
        }
    }

    void returnBook( String bookName  ) {
//        Book newBook = new Book(bookName, id);

        books.put( bookName , books.get(bookName) + 1 );
        System.out.println("Thanks for returning");
    }

    void printBooksAvailable() {
        System.out.println("Available Books are :");
        for(String book : books.keySet() ) {
            System.out.println( book + " left:" + books.get(book));
        }
    }

    void exit() {
        System.exit(0);
    }

}
