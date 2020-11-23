package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lo = new ArrayList(); // List tanpa type parameter
        lo.add("lo - String 1"); //lo menampung objek string
        lo.add(new Planet("Mercury, ", 0.05)); //lp menampung objek planet

        for (Object o : lo){
            Planet p = (Planet) o;
            p.print();
        }


        List<Planet> lp = new ArrayList<>(); //List dengan tipe parameter planet
        lp.add(new Planet("Bumi", 0.75));
        // lp.add("lp -String 1"); //baris ini compile-error, lp tidak diijinkan menampung objek string
        lp.add(new Planet("Venus", 0.56));

        for (Planet p : lp){
            p.print();
        }
    }
}

/**
 *Bila sukses, seharusnya Console akan menampilkan output seperti ini.
 *
 * ---------------------------------------------------------------------------------------------------------------
 *Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class
 * com.dicoding.javafundamental.generics.Planet (java.lang.String is in module java.base of loader 'bootstrap';
 * com.dicoding.javafundamental.generics.Planet is in unnamed module of loader 'app')
 * at com.dicoding.javafundamental.generics.Main.main(Main.java:14)
 * ----------------------------------------------------------------------------------------------------------------
 *
 *
 *
 *
 */
