package com.company;

public class XMLSweetsInfo extends Sweets {


    private int    id;
    private String type;

    public XMLSweetsInfo ( ) {
    }

    public XMLSweetsInfo ( String name , double weight , String type , int id ) {

        super ( name , weight );

        this.type = type;
        this.id = id;

    }

    public String getType ( ) {
        return type;
    }

    public void setType ( String type ) {
        this.type = type;
    }

    public int getId ( ) {
        return id;
    }

    public void setId ( int id ) {
        this.id = id;
    }


    @Override
    public String toString ( ) {
        return "Sweets:: ID=" + this.id + " Name=" + super.getName() + " Weight=" + super.getWeight() + " Type=" + this.type;
    }


}
