package com.bridgelabz.java;

import java.util.Scanner;

public class ReverseNo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=scanner.nextInt();
        int temp = num;
        int rev=0;

        while(num!=0)
        {
            int rem = num %10;
            rev = rev * 10 + rem;
            num = num/10;
        }

        System.out.println("Given Number: "+temp);
        System.out.println("Reversed number is: "+rev);

    }

}

