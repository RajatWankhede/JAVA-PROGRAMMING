package com.java.programming.loop_programs;

import java.util.Scanner;

/*
Write a Java program to find the largest digit  in the given series of number.

Description :
Input : 12321
Output : 3
 */
public class LargestNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in)  ;
        int num  = s.nextInt() ;
        int largest_digit = num %10  ;

        num /= 10  ;
        while( num != 0 ){
            int digit = num % 10  ;
            if( digit > largest_digit)
            {
                largest_digit = digit ;
            }
            num  /= 10 ;
        }
        System.out.println(largest_digit);
    }
}

