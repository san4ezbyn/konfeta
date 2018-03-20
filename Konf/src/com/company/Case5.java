package com.company;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Case5 extends Utils {


    public void runCase5 ( ) throws IOException {


//записать содержимое файла в массив
           List<String> podarok = Files.readAllLines( Paths.get("ListOfSweets.txt"), Charset.defaultCharset());
            System.out.println (podarok);


    }

}

