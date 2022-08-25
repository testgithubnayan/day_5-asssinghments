package com.bridgelabz.basics;

import java.util.Scanner;

public class PrimeFactors {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter a number to find out its factor");
        int n = scr.nextInt();

        System.out.println("prime factors are: ");
        for (int i = 2; i <= n; i++){

            while (n % i == 0){
                System.out.println(i+ " ");
                n= n/i;
            }
        }
        if(n<1){
            System.out.println(n);
        }
    }
}
