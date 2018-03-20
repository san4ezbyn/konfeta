package com.company;

public class BDinit extends Sweets{


        private int    id;


        public BDinit ( ) {
        }

        public BDinit ( String name , double weight , int id ) {

            super ( name , weight );

            //this.salary = salary;
            this.id = id;

        }

      /*  public int getSalary ( ) {
            return salary;
        }

        public void setSalary ( int salary ) {
            this.salary = salary;
        }*/

        public int getId ( ) {
            return id;
        }

        public void setId ( int id ) {
            this.id = id;
        }


        @Override
        public String toString ( ) {
            return "Sweets:: ID=" + this.id + " Name=" + super.getName() +  " Weight=" + super.getWeight();
        }


    }














