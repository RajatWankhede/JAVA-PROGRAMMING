package com.java.programming.number_programs;

import java.util.Scanner;

public class LcmOfNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter The Second Number : ");
        int num2 = sc.nextInt();

        //To find Largest of Two Numbers
        int large = num1 > num2 ? num1 : num2 ;

        //we take infinite loop
        while(true){
            if(large % num1 == 0 && large % num2 == 0){
                break;
            }
            large++;
        }
        System.out.println("The LCM of "+num1 +" & "+num2+ " is " + large);
    }
}
