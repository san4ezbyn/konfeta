package com.company;

import java.io.*;
import java.util.*;
import java.lang.String;


public class Utils {

    public static void doSmth() throws IOException {

        List<Sweets> podarok = new ArrayList<>(); //ссылочная переменная


//VERSION CINCO   5.0.1

        File file = new File("text1.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.print("THIS IS TEXT WRITTEN IN THE FILE: LET'S START IT. PODAROK IS AT LARGE. ATTENCION!!! ACHTUNG!!! UVAGA!!!");
        pw.print("PrintWriter vs Scanner used");
        pw.close();

        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()) {
            System.out.println(scanner.nextLine());
        }

File  file2   = new File ("text2.txt");
      FileWriter fileWriter = new FileWriter (file2);
      fileWriter.write ("This is text-2. FileWriter vs BufferedReader/FileReader are used.");
      fileWriter.close();



        BufferedReader br = new BufferedReader (new FileReader (file2));
        for (;;){
            String line = br.readLine();
            if (line == null)
                break;
            System.out.println (line);

        }

        br.close();



//-------Выбрать действие с конфетами------------


        boolean choiceMENU1 = false;
        while (true) {
            System.out.print("\nMake your choice (MENU-1), please.\n");
            System.out.println("\n0. EXIT.");
            System.out.println("1. Add sweets to podarok.");
            System.out.println("2. Find sweets in podarok.");
            System.out.println("3. Show total weight of podarok.");
            System.out.println("4. Show content of podarok.");

            try {
                Scanner scan = new Scanner(System.in);


                int act = scan.nextInt();


                switch (act) {

                    case 0: {
                        choiceMENU1 = false;
                        System.out.print("\nDONE (MENU-1)");
                        break;
                    }
                    case 1: {

                        boolean viborMenu2 = false;
                        while (true) {

                            System.out.print("\nMake your choice (MENU-2), please.\n");

                            System.out.println("\n11. Add lollipop.");
                            System.out.println("12. Add Choco.");
                            System.out.println("13. Add fruit.");
                            System.out.println("14. Exit.");

                            int addSweetVpodarok = scan.nextInt();
                            switch (addSweetVpodarok) {
                                case 11: {
                                    int quantity;
                                    System.out.println("How much of konfetoks should I add to podarok?");
                                    quantity = scan.nextInt();

                                    for (int i = 1; i <= quantity; i++) {

                                        Lollipop lollipop = new Lollipop();
                                        System.out.println("Enter lollipop's name: ");
                                        String name = scan.next();
                                        lollipop.setName(name);
                                        System.out.println("Enter the weight of lollipop, please: ");

                                        int weight = scan.nextInt();
                                        lollipop.setWeight(weight);

                                        podarok.add(lollipop);
                                    }
                                    System.out.println("Podarok contains: " + podarok + "\n");
                                    break;
                                }

                                case 12: {

                                    // дубляж of Case11. useless
                                    int quantity;
                                    System.out.println("How much of choco should I add to podarok?");
                                    quantity = scan.nextInt();

                                    for (int i = 1; i <= quantity; i++) {

                                        Choco choco = new Choco();
                                        System.out.println("Enter choco's name: ");
                                        String name = scan.next();
                                        choco.setName(name);

                                        System.out.println("Enter its weight: ");
                                        int weight = scan.nextInt();
                                        choco.setWeight(weight);

                                        podarok.add(choco);

                                    }
                                    System.out.println("Podarok contains: " + podarok + "\n");

                                    break;
                                }
                                case 13: {

                                    System.out.println("How much Fruits in the podarok?");
                                    int quantity = scan.nextInt();
                                    System.out.println("In the podarok there are  " + quantity + " fruits");
                                    System.out.println("And how many of them are fresh?");
                                    int quantFresh = scan.nextInt();
                                    System.out.println("There are " + quantFresh + " totally fresh fruits");

                                    break;
                                }
                                // Задума была, чтобы при выборе этого кейса пользователя выбрасывало в МЕНЮ-1. Пока не понимаю, как это сделать.
                                case 14: {
                                    viborMenu2 = false;

                                    System.out.println("\nDONE & FINISHED(MENU-2).\n");

                                    break;

                                }
                                default: {


                                    System.out.println("Wrong type (MENU 2). Enter a valid one!");
                                    break;
                                }
                            }
                        }
                    }

                    //MENU-1. Find sweets in podarok.

                    case 2: {


                        Lollipop lollipop = new Lollipop();
                        System.out.println("Enter konfetka's name: ");
                        String name = scan.next();
                        lollipop.setName(name);

                        podarok.add(lollipop);

                        for (Sweets sweet : podarok) ;

                        if (name.equals("red")) {

                            System.out.println("\nPodarok содержит " + name);
                        } else {
                            System.out.println("\nPodarok НЕ содержит наименование " + name);
                        }


                        break;
                    }

                    case 3: {

                        System.out.println("How much konfetok to weight? ");
                        int konfetokNum = scan.nextInt();
                        int arr[] = new int[konfetokNum];
                        System.out.println("Input konfetka's weight: ");

                        for (int konfetQuantity = 0; konfetQuantity < konfetokNum; konfetQuantity++) {


                            arr[konfetQuantity] = scan.nextInt();
                        }
                        System.out.println("Sweets of podarok have following weights: ");
                        for (int konfetQuantity = 0; konfetQuantity < konfetokNum; konfetQuantity++) {
                            System.out.println("v podarke est: " + arr[konfetQuantity] + "gr");


                        }
                        int sumVes = 0;
                        for (int ves : arr) {
                            sumVes = sumVes + ves;
                        }
                        System.out.println("Podarok has following weight: " + sumVes);


                        break;

                    }

                    //Здесь лажKа. Похоже на Case12 ( может лучше вообще было бы его убрать, но остался и остался. Поиграл с sort.

                    case 4: {


                        Choco choco = new Choco();

                        System.out.println("Fill in the content of podarok, please: ");
                        String name = scan.next();
                        choco.setName(name);
                        podarok.add(choco);
                        for (Sweets content : podarok) ;
                        System.out.println("The cotent of podarok is: " + podarok + " \n");


                        if (name != "q") {

                            break;

                        }


                        break;
                    }


                    default: {
                        // ERROR IF TYPE A LETTER INSTEAD OF INTEGER!!!!!!!!

                        System.out.println("Wrong type (MENU-1). Enter valid one!");
                        break;
                    }
                }
            } catch
                    (InputMismatchException e) {
                System.out.println("EXCEPTION message: Enter digits only. No letters, please.");

            }
            finally {
                System.out.print ("this is FINALLY block.");
            }
        }

    }
}
