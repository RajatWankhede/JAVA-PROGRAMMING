package com.java.programming.loop_programs;

import java.util.Scanner;

/*
Write a Java program to determine whether a given integer number is a Tech number.A number is called a tech number if the given number has an even number of digits and the number can be divided exactly into two parts from the middle. After equally dividing the number, sum up the numbers and find the square of the sum. If we get the number itself as square, the given number is a tech number, else, not a tech number.
Example :   number = 2025
                   = 20 + 25
                   = (45)2
              2025 = 2025
	             Hence 2025 is a Tech number.
 */
public class TechNumber {
    public static int findLength(int num){
        int count = 0;
        while (num != 0){
            num /= 10;
            count ++;
        }
        return count;
    }
    public static int findNum1(int num1, int length){
        while (num1 <= length/2){
            num1 /= 10;
        }
        return num1;
    }
     public static int findNum2(int num, int length){
        int res = 0;
        while (num <= length/2){
            int n = num % 10;
            res = res * 10 + n;
            num /= 10;
        }
        return reverse(res);
     }
     public static int reverse(int num){
         int rev = 0;
         while (num != 0){
             int n2 = num % 10;
             rev = rev * 10 + n2;
             num /= 10;
         }
         return rev;
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Positive Integer Number :");
        int num = sc.nextInt();
        int length = findLength(num);
        int num1 = findNum1(num,length);
        int num2 = findNum2(num,length);

        if (length % 2 == 0){
            int sum = num1 + num2;
            int square = sum * sum;

             if (square == num){
                    System.out.println("It is a TechNumber");
                }
                else {
                    System.out.println("It is not TechNumber");
                }
            }
        else {
                System.out.println("Invalid Number! Please Enter Even Digit Number");
            }
        }
}

