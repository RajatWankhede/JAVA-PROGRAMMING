package com.java.programming.loop_programs;

import java.util.Scanner;

/*
Write a Java program to Find the sum and product of each
digit of the given integer number .
Description :
        Input : 7645
        Output :
        Sum : 22
        Product  :  840
 */
public class ProductOfDigits {
    public static int productOfDigits(int num){
        int prod = 1, res;
        while (num != 0){
            res = num % 10;
            prod *= res;
            num /= 10;
        }
        return prod;
    }

    //Method for Calculate the sum of all digits
    public static int sumOfDigits(int num){
        int sum = 0 , res;
        while (num != 0){
            res = num % 10;
            sum += res;
            num /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Any Integer Number :");
        int num = sc.nextInt();
        int sum = sumOfDigits(num);
        int prod = productOfDigits(num);
        System.out.println("Sum : " + sum);
        System.out.println("Product : " + prod);
    }
}
