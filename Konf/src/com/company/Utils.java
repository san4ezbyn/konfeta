package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;


public class Utils {

    public static List <Sweets> podarok = new ArrayList <> ();
    private static Scanner scan;

    public static void runProg ( ) throws IOException {


//VERSION SEIS   6.0

        boolean choiceMENU1 = true;
        while (choiceMENU1) {
            System.out.print ( "\nMake your choice in MENU-1, please.\n" );
            System.out.println ( "\n0. EXIT." );
            System.out.println ( "1. Add sweets to podarok." );
            System.out.println ( "2. Find sweets in podarok." );
            System.out.println ( "3. Show total weight of podarok." );
            System.out.println ( "4. Show content of podarok." );

            try {
                scan = new Scanner ( System.in );

                int act = scan.nextInt ();
                switch (act) {
                    case 0: {
                        choiceMENU1 = false;
                        System.out.print ( "\nYou have left MENU-1." );
                        break;
                    }
                    case 1: {
                        Content cont = new Content ();
                        cont.caseMENU2 ();

                        break;
                    }


                    case 2: {


                        String name = scan.next ();
                        for (Sweets sweet : podarok) {
                            if (name.equals ( sweet.getName () )) {
                                System.out.println ( sweet );
                            }

                            // печатать, если нет конфеты
                            /*else {
                                System.out.println ( "\nВ ПОДАРКЕ нет" + name );
                            }*/
                        }


                        break;
                    }

                    case 3: {


                        double weight = 0;
                        for (Sweets sweet : podarok) {
                            weight += sweet.getWeight ();
                        }
                        System.out.println ( "ПОДАРОК ВЕСИТ " + weight + " гр" );

                        break;

                    }


                    case 4: {
                        try {
                            File       myFile       = new File ( "podarok.txt" );
                            FileWriter writerINfile = new FileWriter ( myFile );
                            writerINfile.write ( String.valueOf ( "\n" + podarok ) );
                            writerINfile.close ();

                            BufferedReader bufReader = new BufferedReader ( new FileReader ( myFile ) );

                            for (; ; ) {
                                String line = bufReader.readLine ();
                                if (line == null)
                                    break;
                                System.out.println ( line );

                            }

                            bufReader.close ();
                        } catch (FileNotFoundException ex) {
                            System.out.print ( "File not found. Create a file, please." );
                        }


                        break;
                    }


                    default: {

                        System.out.println ( "Wrong type in MENU-1. Enter a valid one!" );
                        break;
                    }
                }
            } catch
                    (InputMismatchException e) {
                System.out.println ( "Enter digits only. No letters, please." );

            }
        }

    }

    public static Sweets initSweet ( Sweets sweet ) {
        System.out.println ( "Enter a sweet's name: " );
        String name = scan.next ();
        sweet.setName ( name );

        System.out.println ( "Enter its weight: " );
        int weight = scan.nextInt ();
        sweet.setWeight ( weight );

        return sweet;
    }
}






