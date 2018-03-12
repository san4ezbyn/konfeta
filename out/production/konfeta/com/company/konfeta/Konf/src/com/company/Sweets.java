package com.company;

public abstract class Sweets {

    private String name;
    private double weight;

    public Sweets ( ) {
    }

    void vid ( String str){
        System.out.println (str);

    }

    Sweets (String name, double weight){
        this.name = name;
        this.weight = weight;
    }





    public String getName ( ) {
        return name;
    }

    public void setName ( String name ) {
        this.name = name;
    }

    public double getWeight ( ) {
        return weight;
    }

    public void setWeight ( double weight ) {
        this.weight = weight;
    }


    public String getInfo() {
        return "Name" + this.name + " weight:" + this.weight;
    }

    @Override
    public String toString ( ) {
        return "Sweets{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';



    }
}
