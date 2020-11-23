package com.dicoding.javafundamental.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPlanet {
    public static void main(String[] args) {
        Set<String> planets = new HashSet<>();

        planets.add("Mercury"); //method add(). untuk menambahkan objek set
        planets.add("venus");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth");
        planets.add("earth");
        planets.add("mars");

        //method size() untuk mendapatkan ukuran set

        System.out.println("Set planet awal : (Size = " + planets.size() + ")");

        for (String planet : planets){
            System.out.println("\t" + planet);
        }

        planets.remove("venus"); // method remove() untuk mengeluarkan objek dari set

        System.out.println("set planets akhir : (Size = " + planets.size() + ")" );

        for (Iterator iterator = planets.iterator(); iterator.hasNext();){
            System.out.println("\t" + iterator.next());
        }

    }
    
}
