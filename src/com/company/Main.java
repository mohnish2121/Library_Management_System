package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char use = 'Y';
        Library user = new Library();

        while (use == 'y' || use == 'Y' ){
            System.out.println("*********Library Management System ************");
            System.out.println("Press 1 to add new Book");
            System.out.println("Press 2 to issue Book");
            System.out.println("Press 3 to return Book");
            System.out.println("Press 4 to Print detains of books ");
            System.out.println("Press 5 to exit");

            System.out.println("Enter any Number");
            int n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter Book name ");
                    sc.nextLine();
                    String book = sc.nextLine();
//                    System.out.println("Enter id");
//                    int id = sc.nextInt();
                    user.addNewBook( book );
                    break;
                case 2:
                    System.out.println("Enter Book name ");
                    sc.nextLine();
                    String book1 = sc.nextLine();
//                    System.out.println("Enter id");
//                    int id1 = sc.nextInt();
                    user.issueBook(book1);
                    break;
                case 3:
                    System.out.println("Enter Book name ");
                    sc.nextLine();
                    String book2 = sc.nextLine();
//                    System.out.println("Enter id");
//                    int id2 = sc.nextInt();
                    user.returnBook( book2 );
                    break;
                case 4:
                    user.printBooksAvailable();
                    sc.nextLine();
                    break;
                case 5:
                    user.exit();
                    break;
                default:
                    System.out.println("Invalid num");
                    sc.nextLine();


            }
            System.out.println("Enter y or n to continue or stop");

            use = sc.nextLine().charAt(0);


        }
    }
}
