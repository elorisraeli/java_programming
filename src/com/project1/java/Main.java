package com.project1.java;

import java.util.Scanner;

public class Main {
    public static int num1 = 1;
    public static double num2 = 2.0;
    public static String num3 = "number 3";
    public static char num4 = '4';

    public static void main(String[] args) {
        System.out.println("Hello World");
        System.out.println("The numbers: "+num1+", "+num2+", "+num3+", "+ num4);

        // the exercise and his solution
        Scanner input = new Scanner(System.in);
        System.out.print("Input the first number: ");
        int num1 = input.nextInt();
        System.out.print("Input the second number: ");
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println();
        System.out.println("Sum: "+sum);

    }
}
