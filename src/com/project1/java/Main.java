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
        int[] array = new int [2];
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

            int guess = 0;
            int num_of_guess = 0;
            int guess_limit = 5;
            boolean out_of_guess = false;
            int num_to_guess = ran.nextInt(3) + 1;
            System.out.println("Enter your guess: ");
            guess = input.nextInt();

            while ((guess != num_to_guess) && (!out_of_guess)){
                if (num_of_guess < guess_limit){
                    System.out.println("Enter your guess: ");
                    guess = input.nextInt();
                    num_of_guess += 1;
                }else{
                    out_of_guess = true;
                    System.out.println("You lose.");
                }
            }
            System.out.println("You won.");

//            secret_word = "elor"
//            guess = ""
//            num_of_guess = 0
//            guess_limit = 5
//            out_of_guess = False
//
//            while guess != secret_word and not out_of_guess:
//            if num_of_guess == 3:
//            print("Take a hint -> its the name of the programmer")
//            if num_of_guess < guess_limit:
//            guess = input("Enter your guess: ")
//            num_of_guess += 1
//    else:
//            out_of_guess = True
//            if out_of_guess:
//            print("Out of guesses, YOU LOSE!")
//else:
//            print("You Won!")

            ////////////////////////
//            System.out.println("You need to guess a number between 1-3," +
//                    "\nThree times to win, you have 2 lives if you guess wrong.");
//            int win_count = 0;
//            int lives = 2;
//            while (true){
//                // int name = Random().nextInt(range) + minimum;
//                int num = ran.nextInt(3) + 1;
//                System.out.println("Enter your guess: ");
//                int guess = input.nextInt();
//                while (lives != 0){
//                    if (num != guess){
//                        lives -= 1;
//                        System.out.println("Wrong guess " +username+ " 1 live off, reminds " +lives+ " lives");
//                        System.out.println("Enter your guess: ");
//                        guess = input.nextInt();
//                    } else break;
//                    if (lives == 0){
//                        System.out.println("You lose, not you lucky day " +username+ " maybe next time..");
//                        break;
//                    }
//                }
////                if (num != guess){
////                    lives -= 1;
////                    if (lives == 0){
////                        System.out.println("Not you lucky day " +username+ " maybe next time..");
////                        break;
////                    }
////                    System.out.println("Wrong guess " +username+ " 1 live off, reminds " +lives+ " lives");
////                }
//                win_count ++;
//                if (win_count == 3){
//                    System.out.println("I must to tell you " + username +
//                            " a long time I don't see such a lucky guy like you! YOU WON MY GAME!!!!!!");
//                    System.out.println("And the winner is...........: " + username + "!!!!!!!!!!!!!!!!");
//                    break;
//                }
//            }
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
            } else {
                System.out.println("Ok, bye.");
                break;
            }
        }
    }
}
