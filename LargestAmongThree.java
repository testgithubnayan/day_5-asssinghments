package com.bridgelabz.basics;

public class LargestAmongThree {

        public static void main(String[] args) {
            int num1 = 65;
            int num2 = 78;
            int num3 = 56;

            if (num1 >= num2 && num1 >= num3){
                System.out.println("num1 is largest number");
            }
            else if(num2 >= num3 && num2 >= num1){
                System.out.println("num2 is largest number");
            }
            else{
                System.out.println("num3 is largest number");
            }
        }
}
