package com.company;

public class Module1 {

    String name, fatherName, uni_id, uid;
    int sem;

    public void getData( String name , String fatherName , String uni_id, String uid, int sem ) {
        this.name = name ;
        this.fatherName = fatherName;
        this.uni_id = uni_id;
        this.uid = uid;
        this.sem = sem;
    }

    public void printData () {
        System.out.println("Student's name :" + name );
        System.out.println("Student's Father name:" + fatherName );
        System.out.println("Student's uni_id :" + uni_id );
        System.out.println("Student's uid :" + uid );
        System.out.println("Student's sem :" + sem );
    }
}
