/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex35;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class App {

    public static void populate(Scanner in, ArrayList<String> contestants) {
        String entry;
        while (true) {
            System.out.print("Enter a name: ");
            entry = in.nextLine();
            if (entry.length() == 0) {
                break;
            } else {
                contestants.add(entry);
            }
        }
    }

    public static String pickWinner(ArrayList<String> contestants) {
        Random r = new Random();
        return contestants.get(r.nextInt(contestants.size()));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> contestants = new ArrayList<>();
        populate(in, contestants);
        System.out.printf("The winner is... %s.\n", pickWinner(contestants));
    }
}
