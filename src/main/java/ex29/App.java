/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex29;

import java.util.Scanner;

public class App {

    public static int years(double r) {
        return (int) Math.ceil(72.0 / r);
    }

    // this is ugly, what's the better way of writing this?
    public static double try_get_R(Scanner in) {
        double ret = -1;
        while (true) {
            System.out.print("What is the rate of return? ");
            try {
                ret = Double.parseDouble(in.nextLine());
                return ret;
            } catch (Exception e) {
                // do nothing
            } finally {
                if (ret <= 0) {
                    System.out.println("Sorry. That's not a valid input.");
                    continue;
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double r = try_get_R(in);
        System.out.printf("It will take %d years to double your initial investment.", years(r));
    }
}
