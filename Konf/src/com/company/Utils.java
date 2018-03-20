package com.company;

import javax.xml.crypto.Data;
import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.io.FileNotFoundException;


public class Utils  {


    public static List <Sweets> podarok = new ArrayList <> ();
    private static Scanner scan;

    public static void runProg ( ) throws IOException{


//VERSION OCHO   8.0


        boolean choiceMENU1 = true;
        while (choiceMENU1) {
            System.out.print ( "====================================" );
            System.out.print ( "\nMake your choice in MENU-1, please.\n" );
            System.out.print ( "====================================" );
            System.out.println ( "\n0. EXIT");
            System.out.println ( "1. Add sweets to podarok." );
            System.out.println ( "2. Find sweets in podarok." );
            System.out.println ( "3. Show total weight of podarok." );
            System.out.println ( "4. Show content of podarok." );
            System.out.println ( "5. Fill array from a file." );
            System.out.println ( "6. Connect to DB and print its content out.");
            System.out.println ( "7. Parse XML file and write content into array.");

            try {
                scan = new Scanner ( System.in );

                int act = scan.nextInt ();
                switch (act) {
                    case 0: {
                        choiceMENU1 = false;
                        System.out.print ( "\nYou have left MENU-1.\n" );
                        break;
                    }
                    case 1: {
                        Content.caseMENU2 ();

                        break;
                    }


                    case 2: {


                        String name = scan.next ();
                        for (Sweets sweet : podarok) {
                            if (name.equals ( sweet.getName () )) {
                                System.out.println ( sweet );
                            } else {
                                System.out.print ("No such sweet in podarok.\n");
                            }
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
                            File       myFile2       = new File ( "podarok.txt" );
                            FileWriter writerINfile2 = new FileWriter ( myFile2 );
                            writerINfile2.write ( String.valueOf ( "\n" + podarok ) );
                            writerINfile2.close ();

                            BufferedReader bufReader2 = new BufferedReader ( new FileReader ( myFile2 ) );

                            for (; ; ) {
                                String line = bufReader2.readLine ();
                                if (line == null)
                                    break;
                                System.out.println ( line );

                            }

                            bufReader2.close ();
                        } catch (FileNotFoundException exc) {
                            System.out.print ( "File not found. Create a file, please." );
                        }


                        break;
                    }
                    case 5: {

                        Case5 case5 = new Case5 ();
                        case5.runCase5 ();

                        break;
                    }

                    case 6: {

                        /*ConnectJDBC con = new ConnectJDBC();
                        con.runConnectJDBC();*/
                        BDbody bdb = new BDbody();
                        bdb.runBDbody();


                        break;
                    }
                    case 7: {

                        XMLParserSAX runSAX = new XMLParserSAX ();
                        runSAX.runPARSER();
                        break;
                    }

                    default: {
                        System.out.println ( "***************************************" );
                        System.out.println ( "Wrong type in MENU-1. Enter a valid one!" );
                        System.out.println ( "***************************************" );
                        break;
                    }
                }
            } catch
                    (InputMismatchException e) {
                System.out.println ( "Enter digits only. No letters, please." );

            }
        }


    }

    public static Sweets initSweet ( Sweets sweet ) throws FileNotFoundException {
        System.out.println ( "Enter a sweet's name: " );
        String name = scan.next ();
        sweet.setName ( name );

        System.out.println ( "Enter its weight: " );
        int weight = scan.nextInt ();
        sweet.setWeight ( weight );

        return sweet;

    }



}






