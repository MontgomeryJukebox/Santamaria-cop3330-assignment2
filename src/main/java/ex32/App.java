/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex32;

import java.util.Scanner;
import java.util.Random;

public class App {

    public static void playGame(Scanner in, int diff) {
        boolean running = true;
        while (running) {
            int range = (int) Math.pow(10, diff);
            Random r = new Random();
            int win = r.nextInt(range - 1) + 1;
            int guesses = 0, guess;
            System.out.println("I have my number. What's your guess? ");
            do {
                guesses++;
                guess = tryInt(in);
                if (guess < win) {
                    System.out.print("Too low. Guess again: ");
                } else if (guess > win) {
                    System.out.print("Too high. Guess again: ");
                }
            } while (guess != win);
            System.out.printf("You got it in %d guesses!\n", guesses);

            System.out.println("Do you wish to play again (Y/N)? ");
            if (Character.toLowerCase(in.next().charAt(0)) == 'n') {
                running = false;
            }
        }
    }

    public static int tryInt(Scanner in) {
        while (true) {
            try {
                return in.nextInt();
            } catch (Exception e) {
                System.out.println("You must enter a numeric value.");
                in.nextLine();
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Let's play Guess the Number!");
        System.out.println("Enter the difficulty level (1, 2, or 3):");
        int diff = tryInt(in);
        playGame(in, diff);
    }
}
