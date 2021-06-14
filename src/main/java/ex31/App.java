/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex31;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your age?");
        int age = try_get_int(in);
        System.out.print("What is your resting heart rate?");
        int rate = try_get_int(in);

        System.out.printf("Resting pulse :%d \tAge: %d\n", rate, age);
        printTable(55, 95, age, rate);
    }

    public static int try_get_int(Scanner in) {
        while (true) {
            try {
                return in.nextInt();
            } catch (Exception e) {
                System.out.println("You must enter a whole number");
                in.nextLine();
            }
        }
    }

    public static void printLine(int intensity, int age, int rate) {
        int bpm = getTargetHeartRate(intensity, age, rate);
        System.out.printf("%d%% %10s %d bpm\n", intensity, "|", bpm);
    }

    public static int getTargetHeartRate(int intensity, int age, int rate) {
        return (int) (((220 - age) - rate) * ((double) intensity) / 100) + rate;
    }

    public static void printTable(int low, int high, int age, int rate) {
        System.out.printf("Intensity\t | Rate\n");
        System.out.printf("-------------|--------\n");
        for (int i = low; i <= high; i++) {
            printLine(i, age, rate);
        }
    }
}
