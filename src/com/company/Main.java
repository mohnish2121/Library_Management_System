package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice = 0;

        while( choice != 3 ) {
            System.out.println( "Enter 1 for module 1 \nEnter 2 for module 2 \n" );
            choice = sc.nextInt();
            sc.nextLine();

            if( choice == 1 )  {
                Module1 obj = new Module1();

                System.out.println("Enter Name of Student ");
                String name = sc.nextLine();

                System.out.println("Enter father name");
                String fatherName = sc.nextLine();

                System.out.println("Enter university id ");
                String uni_id = sc.nextLine();

                System.out.println("Enter user id ");
                String uid = sc.nextLine();

                System.out.println("Enter sem");
                int sem = sc.nextInt();

                obj.getData(name , fatherName , uni_id , uid, sem );

                obj.printData();


            }
            else if ( choice == 2 ) {
                Module2 obj = new Module2();
                obj.chemistry();
                obj.physics();
                obj.python();
            }

        }
    }
}
