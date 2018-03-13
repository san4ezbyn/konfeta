package com.company;


import java.util.Scanner;

public class Content extends Utils {
    public static void caseMENU2 ( ) {
        Scanner scan       = new Scanner ( System.in );
        boolean viborMenu2 = true;
        while (viborMenu2) {

            System.out.print ( "\nMake your choice in MENU-2, please.\n" );

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

                    System.out.println ( "How much Fruits in the podarok?" );
                    int quantity = scan.nextInt ();
                    System.out.println ( "In the podarok there are  " + quantity + " fruits" );
                    System.out.println ( "And how many of them are fresh?" );
                    int quantFresh = scan.nextInt ();
                    System.out.println ( "There are " + quantFresh + " totally fresh fruits" );

                    break;
                }
                case 14: {
                    viborMenu2 = false;

                    System.out.println ( "\nYou have left MENU-2.\n" );

                    break;

                }
                default: {


                    System.out.println ( "Wrong type in MENU 2. Enter a valid one!" );
                    break;
                }
            }
        }


    }


}


