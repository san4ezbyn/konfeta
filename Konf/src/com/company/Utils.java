package com.company;

import java.util.*;


public class Utils {

    public static void doSmth ( ) {

        List <Sweets> podarok; //ссылочная переменная


        podarok = new ArrayList <> ();

//VERSIONS DUO 3.0


//-------Выбрать действие с конфетами------------


        boolean choiceMENU1 = false;
        while (true) {
            System.out.print ( "\nMake your choice (MENU-1), please.\n" );
            System.out.println ( "\n0. EXIT." );
            System.out.println ( "1. Add sweets to podarok." );
            System.out.println ( "2. Find sweets in podarok." );
            System.out.println ( "3. Show total weight of podarok." );
            System.out.println ( "4. Show content of podarok." );


            Scanner scan = new Scanner ( System.in );

            int act = scan.nextInt ();


            switch (act) {

                case 0: {
                    choiceMENU1 = false;
                    System.out.print ( "\nDONE (MENU-1)" );
                    break;
                }
                case 1: {


                    boolean viborMenu2 = false;
                    while (true) {

                        System.out.print ( "Make your choice (MENU-2), please.\n" );

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


                                    Lollipop lollipop = new Lollipop ();
                                    System.out.println ( "Enter lollipop name: " );
                                    String name = scan.next ();
                                    lollipop.setName ( name );
                                    System.out.println ( "Enter lollipop weight: " );

                                    int weight = scan.nextInt ();
                                    lollipop.setWeight ( weight );

                                    podarok.add ( lollipop );


                                    System.out.println ( podarok );

                                }
                                break;

                            }

                            case 12: {
                                int quantity;
                                System.out.println ( "How much of choco should I add to podarok?" );
                                quantity = scan.nextInt ();

                                for (int i = 1; i <= quantity; i++) {

                                    Choco choco = new Choco ();
                                    System.out.println ( "Enter choco name: " );
                                    String name = scan.next ();
                                    choco.setName ( name );
                                    System.out.println ( "Enter choco weight: " );

                                    int weight = scan.nextInt ();
                                    choco.setWeight ( weight );

                                    podarok.add ( choco );
                                    System.out.println ( podarok );

                                }


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
                                System.out.println ( "\nDONE & FINISHED(MENU-2)." );


                                break;
                            }
                            default: {
                                // ERROR IF TYPE A LETTER INSTEAD OF INTEGER!!!!!!!!

                                System.out.println ( "Wrong type (MENU 2). Enter valid one!" );
                                break;
                            }

                        }


                    }


                }


//MENU-1. Find sweets in podarok.

                case 2: {

                        Lollipop lollipop = new Lollipop ();
                        System.out.println ( "Enter konfetka's name: " );
                        String name = scan.next ();
                        lollipop.setName ( name );

                        podarok.add ( lollipop);

                        System.out.println ( podarok );


                        for (Sweets sweet: podarok) ;

String searchString = "red";
                            if (podarok.contains ( searchString )) {

                                System.out.println ( "\nPodarok содержит red" );
                            }
                            else {
                                System.out.println ( "\nPodarok НЕ содержит наименование RED" );
                            }



                    break;
                }







                case 3: {
                    System.out.print ( "Enter weight of sweet 1: " );
                    int weight1 = scan.nextInt ();
                    System.out.print ( "Enter weight of sweet 2: " );
                    int weight2 = scan.nextInt ();
                    System.out.print ( "Enter weight of sweet 3: " );
                    int weight3    = scan.nextInt ();
                    int vesPodarka = weight1 + weight2 + weight3;
                    System.out.println ( "Ves podarka is " + vesPodarka );

                    break;

                }

                case 4: {
                    System.out.println ( "How much sweets in the podarok?  " );
                    int size    = scan.nextInt (); // Читаем с клавиатуры размер массива и записываем в size
                    int array[] = new int[size]; // Создаём массив int размером в size
                    System.out.println ( "Insert elements of podarok: " );
                    //*Пройдёмся по всему массиву, заполняя его*//*
                    for (int i = 0; i < size; i++) {
                        array[i] = scan.nextInt (); // Заполняем массив элементами, введёнными с клавиатуры
                    }
                    System.out.print ( "The content of podarok is: " );
                    for (int i = 0; i < size; i++) {
                        Arrays.sort ( array );
                        System.out.print ( " " + array[i] ); // Выводим на экран, полученный массив
                    }
                    System.out.println ();
                    break;
                }


                default: {
                    // ERROR IF TYPE A LETTER INSTEAD OF INTEGER!!!!!!!!

                    System.out.println ( "Wrong type (MENU-1). Enter valid one!" );
                    break;
                }
            }

        }


    }
}






