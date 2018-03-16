package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Case5 extends Utils {


    public void runCase5 ( ) throws IOException {



        File       myFile       = new File ( "content" );
        FileWriter writerINfile = new FileWriter ( myFile );
        writerINfile.write ( String.valueOf ( "SWEETS:  Lollipop Lol1 8\nLollipop Lol2 9\nLollipop Lol3 11\nLollipop Lol4 12\nChoco Chocolade1 9\nChoco Chocolade2 12\nChoco Chocolade3 13\nFruit Apple 100\nFruit Plum 25\nFruit Peach 90 " ) );

        writerINfile.close ();


            List<String> podarok = Files.readAllLines( Paths.get("content"), Charset.defaultCharset());
            System.out.println (podarok);




    }

}

