package com.dicoding.javafundamental.Casting;

public class Main {
    public static void main(String[] args) {
        Kucing anggora = new Kucing();

        Hewan hewan = anggora; // secara implisit upcasting
        hewan = (Hewan) anggora; // secara explisit melakukan casting dari subclass ke superclass


        Hewan hewan1 = new Kucing();
        ((Kucing) hewan1).meow(); //downcast hewan2 ke kucing, casting dari superclass ke subcalss

    }
}
