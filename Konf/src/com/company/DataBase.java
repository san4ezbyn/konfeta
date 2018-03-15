package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;


public class DataBase extends Utils {


    protected static final String DATABASE_PROPERTIES = "dbase.txt";


    protected static void runDataBase () throws FileNotFoundException{

        Properties pr = new Properties ();
        try

        {
            FileInputStream inp = new FileInputStream ( "Dbase.txt" );
            pr.load ( inp );

            inp.close ();


        } catch (
                IOException e){e.printStackTrace();
        }




        String databaseURL = pr.getProperty ( "dbURL" );
        String user        = pr.getProperty ( "user" );
        String password    = pr.getProperty ( "password" );
        String driverName  = pr.getProperty ( "driver" );


        boolean repeat = true;
        while (repeat){

            System.out.println ("1. Read from txt file");
            System.out.println ("2. Read from DB");
            System.out.println ("3. Read from xml");
            System.out.println ("0. Exit");

            Scanner scanner = new Scanner (System.in);
            int action = scanner.nextInt();

            switch (action){
                case 0:
                    repeat = false;
                    System.out.println ("You have left MENU-3.");
                    break;
                case 1:
                    System.out.println ("Enter employee's id.");
                    int id1=scanner.nextInt();
                    TxtFileReader txtReader = new txtFileReader(EMPLOYEE_INFO_TXT);
                    try {
                        Employee employee = txtReader.readInfo ( id1 );
                        System.out.println ( employee.toString () );
                    }
                    catch (NullPointerException ex) {
                        System.out.println ( "There is no employee with id= " + id1 );
                    }
                    break;
                case 2:
                    System.out.print ("Enter employee's ID:");
                    int id2 = scanner.nextInt();

                    try

                    {
                        Class.forName ( driverName );
                        System.out.println ( "Ok" );

                    } catch (ClassNotFoundException e)

                    {
                        System.out.print ( "JDBC driver not found" );
                    }

                    Connection c = null;
                    try

                    {
                        c = DriverManager.getConnection ( databaseURL , user , password );
                        System.out.print ( "Connect" );
                    } catch (
                            SQLException e)

                    {
                        System.out.println ( "SQLException" + e.getMessage () );
                    }

                    DatabaseReader dbReader = new DatabaseReader(c);
                    try

                    {
                        Employee employee = dbReader.readInfo ( id2 );
                        System.out.println ( employee.toString () );
                    }
                    catch(NullPointerException ex) {
                        System.out.println ( "There is no employee with id= " + id2 );
                    }
                    try {
                        if (c != null)
                            c.close ();
                    } catch (SQLException e) {
                    }


                    break;
                case 3:


            }

        }













        ResultSet rs = null;
        Statement s  = null;
        try

        {
            s = c.createStatement ();
            rs = s.executeQuery ( "select name, salary from employees" );
            while (rs.next ()) {
                System.out.println ( rs.getString ( "name" ) + rs.getString ( "salary" ) );
            }
        } catch (
                SQLException e)

        {

            System.out.println ( "SQLException" + e.getMessage () );
        } finally

        {
            try {
                if (rs != null)
                    rs.close ();
            } catch (SQLException e) {
            }
            try {
                if (s != null)
                    s.close ();
            } catch (SQLException e) {
            }



        }

    }
}
