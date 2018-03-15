package com.company;


import java.io.FileNotFoundException;
import java.util.Scanner;

public class Content extends Utils {

    protected static void caseMENU2 ( ) throws FileNotFoundException {

        Scanner scan       = new Scanner ( System.in );

        boolean viborMenu2 = true;
        while (viborMenu2) {

            System.out.print ( "====================================" );
            System.out.print ( "\nMake your choice in MENU-2, please.\n" );
            System.out.print ( "====================================" );

            System.out.println ( "\n11. Add lollipop." );
            System.out.println ( "12. Add Choco." );
            System.out.println ( "13. Add fruit." );
            System.out.println ( "14. Exit." );

            int addSweetVpodarok = scan.nextInt ();
            switch (addSweetVpodarok) {
                case 11: {
                    int quantity;
                    System.out.println ( "How much of konfetoks should I add to podarok?" );
                    quantity = scan.nextInt ();

                    for (int i = 1; i <= quantity; i++) {
                        podarok.add ( initSweet ( new Lollipop () ) );
                    }
                    System.out.println ( "В ПОДАРКЕ: " + podarok + "\n" );
                    break;
                }

                case 12: {

                    int quantity;
                    System.out.println ( "How much of choco should I add to podarok?" );
                    quantity = scan.nextInt ();
                    for (int i = 1; i <= quantity; i++) {
                        podarok.add ( initSweet ( new Choco () ) );

                    }
                    System.out.println ( "В ПОДАРКЕ: " + podarok + "\n" );

                    break;
                }
                case 13: {


                    int quantity;
                    System.out.print ( "Input quantity of fruits: " );
                    quantity = scan.nextInt ();
                    for (int i = 1; i <= quantity; i++) {
                        podarok.add ( initSweet ( new Lollipop () ) );
                    }
                    System.out.println ( "В ПОДАРКЕ: " + podarok + "\n" );
                    break;

                }
                case 14: {
                    viborMenu2 = false;

                    System.out.println ( "\nYou have left MENU-2.\n" );

                    break;

                }
                default: {

                    System.out.println ( "***************************************" );
                    System.out.println ( "Wrong type in MENU 2. Enter a valid one!" );
                    System.out.println ( "***************************************" );
                    break;
                }
            }
        }


    }


}


