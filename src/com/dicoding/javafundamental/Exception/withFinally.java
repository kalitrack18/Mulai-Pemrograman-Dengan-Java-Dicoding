package com.dicoding.javafundamental.Exception;

public class withFinally {
    public static void main(String[] args) {
        int [] a = new int[5];

        try {
            System.out.println("Akses Elemen Ke 5 : " + a[4]);
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Exception Thrown : " + e);
        } finally {
            a[4] = 10;
            System.out.println("Nilai elemen trakhir : "+ a[4]);
        }
    }
}
