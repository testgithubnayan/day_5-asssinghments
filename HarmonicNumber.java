package com.bridgelabz.basics;

import java.util.Scanner;

public class HarmonicNumber {

        public static void main(String[] args) {
            Scanner s = new Scanner(System.in);
            System.out.println("Enter the value of n");
            double n =s.nextInt();
            double h = 0.0;

            if(n>0){
                for(double i = 1.0; i <= n; i++){
                    h = h+(1/i);
                }
                System.out.println(h);
            }
            System.out.println("Enter positive number");

        }


}
