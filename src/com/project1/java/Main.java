package com.project1.java;

import java.util.Random;
import java.util.Scanner;

public class Main {
    static void game(){
        String username;
        String password;
        Scanner input = new Scanner(System.in);
        // let's practice some more
        while (true) {
            System.out.print("Input the username: ");
            username = input.next();
            System.out.print("Input the password: ");
            password = input.next();
            if (!username.equals(password)) {
                System.out.println("Welcome " + username + "! You are in!");
                break;
            }
            System.out.println("Password and username must be different!");
        }

        // if log in -> math game
        Random ran = new Random();
        int[] array = new int [6];
        for (int i = 0; i < array.length; i ++){
            array[i] = ran.nextInt(100) + 1;
        }
        boolean isSuccess = true;
        for (int i = 0; i < array.length-1; i ++){
            System.out.println("How much is: "+array[i]+" + "+array[i+1]);
            int result = input.nextInt();
            int real_result = array[i] + array[i+1];
            if (result != real_result){
                System.out.println("You lose.." + username + "\n" +
                        "The result of "+array[i]+" + "+array[i+1]+ " is "+ real_result);
                isSuccess = false;
                break;
            }
        }
        if (!isSuccess){
            System.out.println(username + " you can't continue to play, because you lose.. sorry..");
        }
        else {
            System.out.println("You complete all questions!! Congratulations!!!");
            System.out.println("Good job " + username);
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
                    System.out.println("Ok I got it.. Sorry for being annoying.." +
                            " That's all for today, thanks " + username + " :)");
                    break;
                }
            }
            // check if remember the password
            System.out.println("Checking your memory: Do you Remember your password?");
            String pass_memo = input.next();
            if (!pass_memo.equals(password)){
                System.out.println("Not the correct one.. don't worry we continue to play :)");
            }else
                System.out.println(username + " you are AWESOME!!!!!!!!");

            // if success -> guessing game

        }
    }

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
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Want to play a game? yes/no");
            String answer = input.next();
            if (answer.equals("yes")) {
                game();
            }else break;
        }
    }
}
