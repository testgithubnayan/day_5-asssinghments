package com.bridgelabz.basics;

import java.util.Scanner;

public class FlipCoin {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the number of times to flip a coin: ");
        int n = scr.nextInt();
        int h = 0;
        int t = 0;

        for (int i = 1; i <= n; i++) {
            double flip = Math.floor(Math.random() * 10) % 2;
            if (flip< 0.5) {
                h++;
            } else {
                t++;
            }

        }
        double headpercentage = (h*100) /n;
        double tailpercentage = (t*100) /n;
        System.out.println("The percentage of head flips:" + headpercentage);
        System.out.println("The percentage of head flips:" + tailpercentage);


    }
}
