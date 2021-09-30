package com.project1.java;

import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        System.out.println("Hello World");

//        // the exercise and his solution
//        Scanner input = new Scanner(System.in);
//        System.out.print("Input the first number: ");
//        int num1 = input.nextInt();
//        System.out.print("Input the second number: ");
//        int num2 = input.nextInt();
//        int sum = num1 + num2;
//        System.out.println();
//        System.out.println("Sum: "+sum);

        // let's practice some more
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Input the username: ");
            String username = input.next();
            System.out.print("Input the password: ");
            String password = input.next();
            if (!username.equals(password)) {
                System.out.println("Welcome! You are in!");
                break;
            }
            System.out.println("Password and username must be different!");
        }

        // if log in -> math game
        Random ran = new Random();
        int[] array = new int [2];
        for (int i = 0; i < array.length; i ++){
            array[i] = ran.nextInt(100) + 1;
        }
        Scanner input = new Scanner(System.in);
        boolean isSuccess = true;
        for (int i = 0; i < array.length-1; i ++){
            System.out.println("How much is: "+array[i]+" + "+array[i+1]);
            int result = input.nextInt();
            int real_result = array[i] + array[i+1];
            if (result != real_result){
                System.out.println("You lose.. \n" +
                        "The result of "+array[i]+" + "+array[i+1]+ " is "+ real_result);
                isSuccess = false;
                break;
            }
        }
        if (!isSuccess){
            System.out.println("You can't continue to play, because you lose.. sorry..");
        }
        else {
            System.out.println("You complete all questions!! Congratulations!!!");
            int counter = 0;
            while (true) {
                System.out.println("Ready for next game? yes/no");
                String answer = input.next();
                if (answer.equals("yes")) {
                    System.out.println("Yea!!! come on!! let's play!!!!");
                    break;
                }
                counter++;
                if (counter == 3){
                    System.out.println("Ok I got it.. Sorry for being annoying.. That's all for today, thanks :)");
                    break;
                }
            }

            // if success -> guessing game

        }
    }
}
