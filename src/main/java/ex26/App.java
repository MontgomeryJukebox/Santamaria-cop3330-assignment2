/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex26;

import java.util.Scanner;

public class App {
    public static double months(double dailyRate, int balance, int monthlyPayment) {
        System.out.printf("Called with dailyRate = %f, balance = %d, monthlyPayment = %d\n", dailyRate, balance, monthlyPayment);
        double pow = Math.pow(1 + dailyRate, 30);
        System.out.println("Pow: " + pow);
        double factor = (balance / monthlyPayment);
        System.out.println("Factor: " + factor);
        double rebase = Math.log(dailyRate + 1);
        System.out.println("rebase: " + rebase);
        double argument = 1 + factor * (1 - pow);
        System.out.println("Argument: " + argument);
        double intermediate = Math.log(argument);
        System.out.println("Intermediate: " + intermediate);
        double constant = (-1.0 / 30.0);
        System.out.println("Constant: " + constant);
        return constant * intermediate / rebase;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("What is your balance?");
        int balance = in.nextInt();
        System.out.print("What is the APR on the card (as a percent)?");
        double apr = (double) in.nextInt();
        System.out.print("What is the monthly payment you can make?");
        int monthlyPayment = in.nextInt();
        System.out.printf("It will take you %f months to pay off this card\n", months(apr / 365.0, balance, monthlyPayment));
    }
}
