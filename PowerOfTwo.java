package com.bridgelabz.basics;

import java.util.Scanner;

public class PowerOfTwo {

    public static void main(String[] args) {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n = scn.nextInt();
        if (n == 0) {
            System.out.println("2 power 0 is 1");
        } else {
            for (int i = 1; i <= n; i++) {
                int result = (int) Math.pow(2, i);
                System.out.println("2 power " + i + " is :" + result);
            }

        }
    }
}
