package com.bridgelabz.basics;

import java.util.Scanner;

public class VowelConsonant {

    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.println("Enter the character");
        char ch = scr.next().charAt(0);

        if(ch == 'a' || ch == 'e' || ch == 'i'  || ch == 'o' || ch == 'u'){
            System.out.println(ch+ " is vowel");
        }
        else{
            System.out.println(ch+" is consonant");
        }

    }
}
