package com.company;

public class Fruit extends Sweets {

    private String fresh;

    public Fruit ( ) {


    }

    public Fruit ( String name , double weight , String fresh ) {
        super ( name , weight );
        this.fresh = fresh;
    }

    public String getFresh ( ) {
        return fresh;
    }

    public void setFresh ( String fresh ) {
        this.fresh = fresh;
    }

    @Override
    public String toString ( ) {
      /*  return "Fruit{" +
                " name = '" + super.getName () + "\'" +
                " weight =" + super.getWeight () +
                " fresh ='" + fresh + '\'' +
                '}';*/

        return ("NAME  " +super.getName () + " " +
                "WEIGHT " + super.getWeight () + " gr\n");
    }


}













