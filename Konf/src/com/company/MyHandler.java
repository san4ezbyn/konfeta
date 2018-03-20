package com.company;

import java.util.ArrayList;
import java.util.List;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class MyHandler extends DefaultHandler {

    //List to hold sweets object
    private List <Sweets> podarok = null;
    private XMLSweetsInfo        emp     = null;


    //getter method for sweets list
    public List <Sweets> getEmpList ( ) {
        return podarok;
    }

    boolean bWeight = false;
    boolean bName   = false;
    boolean bType   = false;


    @Override
    public void startElement ( String uri , String localName , String qName , Attributes attributes )
            throws SAXException {

        if (qName.equalsIgnoreCase ( "sweets" )) {
            //create a new sweet and put it in Map
            String id = attributes.getValue ( "id" );
            //initialize sweet object and set id attribute
            emp = new XMLSweetsInfo ();
            emp.setId ( Integer.parseInt ( id ) );
            //initialize list
            if (podarok == null)
                podarok = new ArrayList <> ();
        }
        else if (qName.equalsIgnoreCase ( "name" )) {
            //set boolean values for fields, will be used in setting sweet variables
            bName = true;
        }
        else if (qName.equalsIgnoreCase ( "weight" )) {
            bWeight = true;
        }
        else if (qName.equalsIgnoreCase ( "type" )) {
            bType = true;

        }
    }

@Override
        public void endElement ( String uri, String localName, String qName) throws SAXException {
            if (qName.equalsIgnoreCase ( "sweets" )) {
                //add sweet object to list
                podarok.add ( emp );
            }
        }
        @Override
        public void characters ( char ch[], int start, int length) throws SAXException {


            if (bWeight) {
                //weight element, set sweets weight
                emp.setWeight ( Integer.parseInt ( new String ( ch , start , length ) ) );
                bWeight = false;
            }
            else if (bName) {
                emp.setName ( new String ( ch , start , length ) );
                bName = false;
            }
            else if (bType) {
                emp.setType ( new String ( ch , start , length ) );
                bType = false;
            }
        }
    }

/*
package com.company;

        import java.util.ArrayList;
        import java.util.List;
        import org.xml.sax.Attributes;
        import org.xml.sax.SAXException;
        import org.xml.sax.helpers.DefaultHandler;

//import com.journaldev.xml.Employee;

public class MyHandler extends DefaultHandler {

    //List to hold Employees object
    private List<Employee> empList = null;
    private Employee emp = null;


    //getter method for employee list
    public List<Employee> getEmpList() {
        return empList;
    }

    boolean bWeight = false;
    boolean bName = false;
    boolean bType = false;
    boolean bRole = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes)
            throws SAXException {

        if (qName.equalsIgnoreCase("Employee")) {
            //create a new Employee and put it in Map
            String id = attributes.getValue("id");
            //initialize Employee object and set id attribute
            emp = new Employee();
            emp.setId(Integer.parseInt(id));
            //initialize list
            if (empList == null)
                empList = new ArrayList<>();
        } else if (qName.equalsIgnoreCase("name")) {
            //set boolean values for fields, will be used in setting Employee variables
            bName = true;
        } else if (qName.equalsIgnoreCase("age")) {
            bAge = true;
        } else if (qName.equalsIgnoreCase("gender")) {
            bGender = true;
        } else if (qName.equalsIgnoreCase("role")) {
            bRole = true;
        }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("Employee")) {
            //add Employee object to list
            empList.add(emp);
        }
    }

    @Override



    public void characters(char ch[], int start, int length) throws SAXException {




        if (bAge) {
            //age element, set Employee age
            emp.setAge(Integer.parseInt(new String(ch, start, length)));
            bAge = false;
        } else if (bName) {
            emp.setName(new String(ch, start, length));
            bName = false;
        } else if (bRole) {
            emp.setRole(new String(ch, start, length));
            bRole = false;
        } else if (bGender) {
            emp.setGender(new String(ch, start, length));
            bGender = false;
        }
    }
}*/
