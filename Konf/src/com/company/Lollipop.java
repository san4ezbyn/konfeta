package com.company;

public class Lollipop extends Sweets {
    private String obertka;

    public Lollipop ( ) {
    }

    public Lollipop ( String name , double weight , String obertka ) {

        super ( name , weight );

        this.obertka = obertka;

    }

    public String getObertka ( ) {
        return obertka;
    }

    public void setObertka ( String obertka ) {
        this.obertka = obertka;
    }


    /* закомменченный ниже @Override то же самое, что и

    public String getInfo() {
        return super.getInfo() + this.obertka;
        */


    /*@Override
    public String toString ( ) {
        return "Lollipop{" +
                " name = '" + super.getName () +"\'" +
                " weight =" + super.getWeight () +
                " obertka ='" + obertka + '\'' +
                '}';*/

    public String toString ( ) {
        return super.getName () + " " +
                super.getWeight () + " gr\n";
    }
}



