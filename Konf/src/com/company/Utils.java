package com.company;

import java.util.*;
import java.lang.String;


public class Utils {

    public static void doSmth ( ) {

        List <Sweets> podarok = new ArrayList <> (); //ссылочная переменная


//VERSIONS QUATRO   4.0.3


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

                        System.out.print ( "\nMake your choice (MENU-2), please.\n" );

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
                                    System.out.println ( "Enter lollipop's name: " );
                                    String name = scan.next ();
                                    lollipop.setName ( name );
                                    System.out.println ( "Enter the weight of lollipop, please: " );

                                    int weight = scan.nextInt ();
                                    lollipop.setWeight ( weight );

                                    podarok.add ( lollipop );
                                }
                                System.out.println ( "Podarok contains: " + podarok + "\n" );
                                break;
                            }

                            case 12: {

                                // дубляж of Case11. useless
                                int quantity;
                                System.out.println ( "How much of choco should I add to podarok?" );
                                quantity = scan.nextInt ();

                                for (int i = 1; i <= quantity; i++) {

                                    Choco choco = new Choco ();
                                    System.out.println ( "Enter choco's name: " );
                                    String name = scan.next ();
                                    choco.setName ( name );

                                    System.out.println ( "Enter its weight: " );
                                    int weight = scan.nextInt ();
                                    choco.setWeight ( weight );

                                    podarok.add ( choco );

                                }
                                System.out.println ( "Podarok contains: " + podarok + "\n" );

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
// Задума была, чтобы при выборе этого кейса пользователя выбрасывало в МЕНЮ-1. Пока не понимаю, как это сделать.
                            case 14: {
                                viborMenu2 = false;

                                System.out.println ( "\nDONE & FINISHED(MENU-2).\n" );

                                break;

                            }
                            default: {
                                // ERROR IF TYPE A LETTER INSTEAD OF INTEGER!!!!!!!!

                                System.out.println ( "Wrong type (MENU 2). Enter a valid one!" );
                                break;
                            }
                        }
                    }
                }

//MENU-1. Find sweets in podarok.

                case 2: {

                    // 1st variant не работает (где ошибка?)

              /*          Lollipop lollipop = new Lollipop ();
                        System.out.println ( "Enter konfetka's name: " );
                        String name = scan.next ();
                        lollipop.setName ( name );

                        podarok.add ( lollipop);

                        System.out.println ( podarok );


                        for (Sweets sweet: podarok) ;
                        System.out.println (podarok);

//String searchString = "red";
                            if (podarok.contains ( lollipop)) {

                                System.out.println ( "\nPodarok содержит red" );
                            }
                            else {
                                System.out.println ( "\nPodarok НЕ содержит наименование RED" );
                            }*/

                    // second variant
                    Lollipop lollipop = new Lollipop ();
                    System.out.println ( "Enter konfetka's name: " );
                    String name = scan.next ();
                    lollipop.setName ( name );

                    podarok.add ( lollipop );

                    for (Sweets sweet : podarok) ;

                    if (name.equals ( "red" )) {

                        System.out.println ( "\nPodarok содержит " + name );
                    }
                    else {
                        System.out.println ( "\nPodarok НЕ содержит наименование " + name );
                    }

// 3 variant - не работает (где ошибка?)
                   /* ArrayList <String> podarok2 = new ArrayList <> ();


                    String kon1 = new String ( "Звездочка" );
                    String kon2 = new String ( "Мишки" );
                    String kon3 = new String ( "Коммунарка" );
                    String kon4 = new String ( "Рачки" );
                    String kon5 = new String ( "Белочка" );
                    String kon6 = new String ( "Аленка" );
                    String kon7 = new String ( "Троицкое предместье" );
                    String kon8 = new String ( "Трюфель" );
                    String kon9 = new String ( "Белорусская картошка" );

                    podarok2.add ( kon1 );
                    podarok2.add ( kon2 );
                    podarok2.add ( kon3 );
                    podarok2.add ( kon4 );
                    podarok2.add ( kon5 );
                    podarok2.add ( kon6 );
                    podarok2.add ( kon7 );
                    podarok2.add ( kon8 );
                    podarok2.add ( kon9 );

                    System.out.println ( "Enter konfetka's name: " );
                    String input = scan.next ();

                    Iterator itr = podarok2.iterator ();

                     while (itr.hasNext ()) {
                        String st = (String) itr.next ();
                        //System.out.println ( st );

                        System.out.println ( "В подарке следующие конфеты: " + podarok2 );

                        //for (String sweet : podarok2) ;

                        if (podarok2.contains ( input )) {
                            System.out.println ( "\nPodarok содержит " + input );
                        }
                        else {
                            System.out.println ( "\nPodarok НЕ содержит наименование " + input );
                        }

                        break;
                    }*/
                    break;
                }

                case 3: {

                    System.out.println ( "How much konfetok to weight? " );
                    int konfetokNum = scan.nextInt ();
                    int arr[]       = new int[konfetokNum];
                    System.out.println ( "Input konfetka's weight: " );

                    for (int konfetQuantity = 0; konfetQuantity < konfetokNum; konfetQuantity++) {


                        arr[konfetQuantity] = scan.nextInt ();
                    }
                    System.out.println ( "Sweets of podarok have following weights: " );
                    for (int konfetQuantity = 0; konfetQuantity < konfetokNum; konfetQuantity++) {
                        System.out.println ( "v podarke est: " + arr[konfetQuantity] + "gr" );


                    }
                    int sumVes = 0;
                    for (int ves : arr) {
                        sumVes = sumVes + ves;
                    }
                    System.out.println ( "Podarok has following weight: " + sumVes );


                    break;

                }

                //Здесь лажKа. Похоже на Case12 ( может лучше вообще было бы его убрать, но остался и остался. Поиграл с sort.

                case 4: {
                    /*System.out.println ( "How much sweets in the podarok?  " );
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
                    System.out.println ();*/

                    /*Choco   choco = new Choco ();
                    boolean input = false;
                    while (true) {
                        System.out.println ( "Fill in the content of podarok, please: " );
                        String name = scan.next ();
                        choco.setName ( name );

                        podarok.add ( choco );

                        for (Sweets content : podarok) ;

                        System.out.println ( "The cotent of podarok is: " + podarok +" \n" );*/

                    Choco choco = new Choco ();

                    System.out.println ( "Fill in the content of podarok, please: " );
                    String name = scan.next ();
                    choco.setName ( name );
                    podarok.add ( choco );
                    for (Sweets content : podarok) ;
                    System.out.println ( "The cotent of podarok is: " + podarok + " \n" );


                    if (name != "q") {

                        break;

                    }


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






