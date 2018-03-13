
package com.company;

public class Choco extends Sweets {

    private String pack;

    public Choco ( ) {

    }

    public Choco ( String name , double weight , String pack){
        super(name, weight);
        this.pack = pack;
    }

    public String getPack ( ) {
        return pack;
    }

    public void setPack ( String pack ) {
        this.pack = pack;
    }

    @Override
    public String toString ( ) {
        return super.getName () + " " +
                super.getWeight () + " gr\n";
    }

}


