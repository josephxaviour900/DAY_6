package com.bridgelabz.java;

public class PrimeNo {
    public static void main(String[] args) {
        int count = 0;
        int a = 3;
        for (int i = 2; i <= a; i++) {
            if (a % i == 0) {
                count = count + 1;
            }
        }
        if (count == 1) {
            System.out.println(a + " is a prime number");
        } else {
            System.out.println(a + " is not a prime number");
        }


    }
}