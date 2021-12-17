package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scan = new Scanner(System.in);
        int secretNumber = 1 + (int) (Math.random()* 99);
        int userResponse =-1;
        int numGuesses = 0;

        System.out.println("Welcome to 20 questions. ");
        while (userResponse != secretNumber && numGuesses <=20) {
            System.out.println("Guess a number in between 1-100.");
            userResponse = scan.nextInt();
            numGuesses += 1;
            if(userResponse < secretNumber )
            {
                System.out.println("Your number is too low try again.");
            }
            else if(userResponse > secretNumber)
            {
                System.out.println("Your number is too high try again.");
            }
        }
            if(numGuesses > 20)
            {
                System.out.println("You guessed to many times.");
            }
            else
            {
                System.out.println("Congratulations you guessed the right number!");
            }




    }
}