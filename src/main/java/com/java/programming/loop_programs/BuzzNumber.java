package com.java.programming.loop_programs;

import java.util.Scanner;

/*
Write a java program to find whether the given integer number in Buzz number or not. Buzz number is a number that ends with digit 7 or divisible by 7.
Example :  42 is a Buzz number because it is divisible by 7.
                   107 is a Buzz number because it ends with 7.
 */
public class BuzzNumber {
    public static boolean isDivisible(int num){
        boolean res = false;
        if(num % 7 == 0){
            res = true;
        }
        return res;
    }
    public static boolean endWithNumber(int num){
        boolean res = false;
        num = num % 10;
        if (num == 7){
            res = true;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Integer Number :");
        int num = sc.nextInt();
        boolean div = isDivisible(num);
        boolean end = endWithNumber(num);

        if (div == true || end == true){
            System.out.println(num + " is a Buzz Number.");
        }
        else {
            System.out.println("It is not a Buzz Number.");
        }
    }
}
