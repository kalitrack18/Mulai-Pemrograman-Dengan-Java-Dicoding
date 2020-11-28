package com.dicoding.javafundamental.generics;

import java.util.Collection;

public class GenericMethod {
    private static <T> void arrayToCollection(T[] a, Collection<T>c){
        for (T o : a){
            c.add(o);  // baris ini valid
        }
    }

    public static void main(String[] args){
        Object[] oa = new Object[100];
    }

}
