package com.bridgelabz.basics;


public class SwapTwoNumber {

    public static void main(String[] args) {
        int p = 40;
        int q = 50;

        p = p + q;
        q = p - q;
        p = p - q;

        System.out.println("after swapping value of p is: " +p);
        System.out.println("after swapping value of q is: " +q);

    }
}
