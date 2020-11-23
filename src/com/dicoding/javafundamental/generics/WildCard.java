package com.dicoding.javafundamental.generics;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import static jdk.nashorn.internal.objects.Global.print;

public class WildCard {
    public static void main(String[] args) {

        /**
         * ini adalah baris kode yang benar, setelah di lakukan pembenahan dari kode yang salah,
         * kode salah ada di bagian bawah class WildCard
         *
         */
        List<String> ls = new ArrayList<>();
        ls.add("String1");
        ls.add("String2");

        print(ls);  // baris ini valid

        Collection<Planet> cp = new ArrayList<>();
        cp.add(new Planet("Mercury", 0.07));
        cp.add(new Planet("Venus", 0.45));

        print(cp); // baris ini juga valid

    }

    public static void print(Collection<?> collection){ //  perubahan ada di baris ini   merubah Collection <Object> menjadi Collection <?>
        for(Object o : collection){
            System.out.println(o);
        }
    }
}

/**
 * public static void main(String[] args) {
 *         List<String> ls = new ArrayList();
 *         ls.add("String1");
 *         ls.add("String2");
 *
 *         print(ls); // Apakah baris ini valid?
 *
 *         Collection<Planet> cp = new ArrayList();
 *         cp.add(new Planet("Mercury", 0.06));
 *         cp.add(new Planet("Venus", 0.82));
 *
 *         print(cp); // Apakah baris ini valid?
 *     }
 *
 *     public static void print(Collection<Object> collection) {
 *         for (Object o : collection) {
 *             System.out.println(o);
 *         }
 *     }
 *
 *
 */


