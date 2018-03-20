/*

*/
/*
package com.company;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;
import java.util.List;


public class ConnectJDBC {
    List <Sweets> podarok;
    Utils konf = new Utils ();

   *//*

*/
/* int id;
    String name;
    int wages;

    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getWages() {
        return wages;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setWages(int wages) {
        this.wages = wages;
    }*//*
*/
/*


    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL      = "jdbc:mysql://localhost/my_base?useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";


    void runConnectJDBC ( ) {


        Connection conn = null;
        Statement  stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName ( "com.mysql.jdbc.Driver" );

            //STEP 3: Open a connection
            System.out.println ( "Connecting to database..." );
            conn = DriverManager.getConnection ( DB_URL , USER , PASS );

            //STEP 4: Execute a query
            System.out.println ( "Creating statement..." );
            stmt = conn.createStatement ();
            String sql;
            sql = "SELECT name from employees";
            ResultSet rs = stmt.executeQuery ( sql );

            //STEP 5: Extract data from result set
            while (rs.next ()) {
                //Retrieve by column name
                int    id    = rs.getInt ( "id" );
                String name  = rs.getString ( "name" );
                int    wages = rs.getInt ( "salary" );


             *//*

*/
/*   konf.setId ( rs.getInt ( "id" ) );
                konf.setName ( rs.getString ( "name" ) );
                konf.setWages ( rs.getInt ( "salary" ) );

                podarok.add (konf);
*//*
*/
/*

                //Display values
                System.out.print ( "ID: " + id );
                System.out.print ( ", Name: " + name );
                System.out.println ( ", salary: " + wages );

            }

            //System.out.println ( podarok );
            //STEP 6: Clean-up environment
            rs.close ();
            stmt.close ();
            conn.close ();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace ();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace ();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close ();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close ();
            } catch (SQLException se) {
                se.printStackTrace ();
            }//end finally try
        }//end try
        System.out.println ( "Goodbye!" );
    }//end main


}//end main class
*//*



package com.company;

import java.sql.*;


public class ConnectJDBC extends Utils {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL      = "jdbc:mysql://localhost/my_base?useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public
        */
/*static*//*

    void runConnectJDBC ( ) {
        Connection conn = null;
        Statement  stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName ( "com.mysql.jdbc.Driver" );

            //STEP 3: Open a connection
            System.out.println ( "Connecting to database..." );
            conn = DriverManager.getConnection ( DB_URL , USER , PASS );

            //STEP 4: Execute a query
            System.out.println ( "Creating statement..." );
            stmt = conn.createStatement ();
            String sql;
            sql = "SELECT id, name, salary from employees";
            ResultSet rs = stmt.executeQuery ( sql );

            //STEP 5: Extract data from result set
            while (rs.next ()) {
                //Retrieve by column name
                int    id    = rs.getInt ( "id" );
                String name  = rs.getString ( "name" );
                int    wages = rs.getInt ( "salary" );


                //Display values
                System.out.print ( "ID: " + id );
                System.out.print ( ", Name: " + name );
                System.out.println ( ", salary: " + wages );
            }
            //STEP 6: Clean-up environment
            rs.close ();
            stmt.close ();
            conn.close ();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace ();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace ();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close ();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close ();
            } catch (SQLException se) {
                se.printStackTrace ();
            }//end finally try
        }//end try
        System.out.println ( "Goodbye!" );
    }//end main
}//end main class





















*/
/*

package com.company;

import java.io.File;
import java.io.FileWriter;
import java.sql.*;


public class ConnectJDBC extends Utils {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL      = "jdbc:mysql://localhost/my_base?useSSL=false";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public *//*

*/
/*static*//*
*/
/*
 void runConnectJDBC ( ) {
        Connection conn = null;
        Statement  stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName ( "com.mysql.jdbc.Driver" );

            //STEP 3: Open a connection
            System.out.println ( "Connecting to database..." );
            conn = DriverManager.getConnection ( DB_URL , USER , PASS );

            //STEP 4: Execute a query
            System.out.println ( "Creating statement..." );
            stmt = conn.createStatement ();
            String sql;
            sql = "SELECT id, name, salary from employees";
            ResultSet rs = stmt.executeQuery ( sql );

            //STEP 5: Extract data from result set
            while (rs.next ()) {
                //Retrieve by column name
                int    id    = rs.getInt ( "id" );
                String name  = rs.getString ( "name" );
                int    wages = rs.getInt ( "salary" );
              *//*

*/
/* Sweets     bd    = new Sweets ( id , name , wages );
                podarok.add ( bd );*//*
*/
/*

                //Display values
                System.out.print ( "ID: " + id );
                System.out.print ( ", Name: " + name );
                System.out.println ( ", salary: " + wages );

            }
            System.out.print ( "HELLO" + podarok + "\n" );
            //STEP 6: Clean-up environment
            rs.close ();
            stmt.close ();
            conn.close ();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace ();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace ();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close ();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close ();
            } catch (SQLException se) {
                se.printStackTrace ();
            }//end finally try
        }//end try
        System.out.println ( "Goodbye!" );
    }//end main
}//end main class


*//*

*/
/*
package com.company;

import java.sql.*;


    public class ConnectJDBC extends Utils {
        // JDBC driver name and database URL
        static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        static final String DB_URL      = "jdbc:mysql://localhost/my_base?useSSL=false";

        //  Database credentials
        static final String USER = "root";
        static final String PASS = "root";

        public *//*
*/
/*

 *//*

*/
/*static*//*
*/
/*
 *//*

*/
/*
 void runConnectJDBC ( ) {
            Connection conn = null;
            Statement  stmt = null;
            try {
                //STEP 2: Register JDBC driver
                Class.forName ( "com.mysql.jdbc.Driver" );

                //STEP 3: Open a connection
                System.out.println ( "Connecting to database..." );
                conn = DriverManager.getConnection ( DB_URL , USER , PASS );

                //STEP 4: Execute a query
                System.out.println ( "Creating statement..." );
                stmt = conn.createStatement ();
                String sql;
                sql = "SELECT id, name, salary from employees";
                ResultSet rs = stmt.executeQuery ( sql );

                //STEP 5: Extract data from result set
                while (rs.next ()) {
                    //Retrieve by column name
                    int    id    = rs.getInt ( "id" );
                    String name  = rs.getString ( "name" );
                    int    wages = rs.getInt ( "salary" );


                   //Display values
                    System.out.print ( "ID: " + id );
                    System.out.print ( ", Name: " + name );
                    System.out.println ( ", salary: " + wages );
                }
                //STEP 6: Clean-up environment
                rs.close ();
                stmt.close ();
                conn.close ();
            } catch (SQLException se) {
                //Handle errors for JDBC
                se.printStackTrace ();
            } catch (Exception e) {
                //Handle errors for Class.forName
                e.printStackTrace ();
            } finally {
                //finally block used to close resources
                try {
                    if (stmt != null)
                        stmt.close ();
                } catch (SQLException se2) {
                }// nothing we can do
                try {
                    if (conn != null)
                        conn.close ();
                } catch (SQLException se) {
                    se.printStackTrace ();
                }//end finally try
            }//end try
            System.out.println ( "Goodbye!" );
        }//end main
    }//end main class














*//*


*/
