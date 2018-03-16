package com.company;

import org.xml.sax.Parser;
import org.xml.sax.helpers.ParserFactory;

import javax.xml.parsers.SAXParser;


//обработка документа xml
public class SaxExample {
    public static String FILE_PATH = "example.xml";

    public static void main ( String argv[] ) {
        try {
            SAXParser sample = new SAXParser ( FILE_PATH );
            Parser    parser = ParserFactory.makeParser ( "com.ibm.xml.parser.SAXDriver" );
            parser.setDocumentHandler ( sample );
            parser.setErrorHandler ( sample );

            parser.parser ( FILE_PATH );
            sample.setErrorHandler ( sample );

        } catch (Exception e) {
            e.printStackTrace ( System.err );
        }

    }
}
