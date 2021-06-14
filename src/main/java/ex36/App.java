/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex36;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static double max(ArrayList<Double> a) {
        double max = a.get(0);
        for (double d : a) {
            max = Math.max(max, d);
        }
        return max;
    }

    public static double min(ArrayList<Double> a) {
        double min = a.get(0);
        for (double d : a) {
            min = Math.min(min, d);
        }
        return min;
    }

    public static double average(ArrayList<Double> a) {
        double sum = 0.0;
        for (double d : a) {
            sum += d;
        }
        return sum / a.size();
    }

    public static double std(ArrayList<Double> a) {
        double ret = 0.0;
        double average = average(a);
        for (double d : a) {
            ret += Math.pow(d - average, 2);
        }
        return Math.sqrt((1.0 / (double) a.size()) * ret);
    }

    public static double tryDouble(Scanner in) {
        while (true) {
            try {
                return in.nextDouble();
            } catch (Exception e) {
                System.out.println("You must enter a numeric value");
                in.nextLine();
            }
        }
    }

    public static void display(ArrayList<Double> a) {
        System.out.print("Numbers: ");
        for (double d : a) {
            System.out.printf("%d ", d);
        }
        System.out.println();
    }

    public static void populate(Scanner in, ArrayList<Double> a) {
        while (true) {
            System.out.print("Enter a number: ");
            while (true) {
                // TODO
            }
        }
    }

    public static void process(ArrayList<Double> a) {

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Double> data = new ArrayList<>();
        populate(in, data);
        process(data);
    }
}
