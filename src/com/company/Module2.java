package com.company;

public class Module2 {

    public void chemistry() {
        String chem[] = { "Organic Chem", "Physical Chem" };
        System.out.println();
        System.out.println("books in chemistry are");
        for( String book : chem ) {
            System.out.println( book );
        }
    }

    public void physics() {
        String phy[] = { "Organic phy", "Physical phy" };
        System.out.println();
        System.out.println("books in phy are");
        for( String book : phy ) {
            System.out.println( book );
        }
    }

    public void python() {
        String py[] = { "Organic py", "Physical py" };
        System.out.println();
        System.out.println("books in py are");
        for( String book : py ) {
            System.out.println( book );
        }
    }


}
