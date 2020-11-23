package com.dicoding.javafundamental.collection;

import java.util.ArrayList;
import java.util.List;

public class ListPlanet {
    public static void main(String[] args) {
        //deklarasi Array
        String[] heroes = new String[2];
        heroes [0] = "riki";
        heroes [1] = "steven";
        //heroes [2] = "zeus";

        // menggunakan ArrayList
        List<String> planets = new ArrayList<>();
        planets.add("mercury"); // method add() untuk menambahkan objek List
        planets.add("venus");
        planets.add("earth");
        planets.add("mars"); // objek lainnya masih bisa terus di tambahkan ke List

        System.out.println("List planets awal : ");
        for (int i=0; i <planets.size();i++){
            System.out.println("Daftar Planets : " + planets.get(i));
        }

        planets.remove("venus");

        System.out.println("List plantes akhir");
        for (int i=0; i<planets.size();i++){
            System.out.println("Daftar Planets : " + planets.get(i));
        }

        planets.add("pluto");
        System.out.println("List plantes akhir");
        for (int i=0; i<planets.size();i++){
            System.out.println("Daftar Planets : " + planets.get(i));
        }

    }
}
