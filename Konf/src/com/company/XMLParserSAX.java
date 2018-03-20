package com.company;

//package com.journaldev.xml.sax;

import java.io.File;
import java.io.IOException;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import org.xml.sax.SAXException;

//import com.journaldev.xml.Employee;

public class XMLParserSAX extends Utils{

    public void runPARSER() {
        SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
        try {
            SAXParser saxParser = saxParserFactory.newSAXParser();
            MyHandler handler = new MyHandler();
            saxParser.parse(new File( "konfetki.xml" ), handler);
            //Get sweets list
            List<Sweets> podarok = handler.getEmpList();
            //print sweets information

                System.out.println(podarok);
        } catch (ParserConfigurationException | SAXException | IOException e) {
            e.printStackTrace();
        }

    }

}