package com.company;

public class Main {

    public static void main(String[] args) {
for (int n = 1; n <= 20; n++)
    System.out.println(sumUpTo (n));
    }
    static int sumUpTo (int n){

       return n*(n + 1) / 2;
    }

}
