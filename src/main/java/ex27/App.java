/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */

package ex27;

import java.util.Scanner;

public class App {
    static Scanner in;

    /*
    Since there are only non-negative integers in this
    exercise, we can return a negative integer in order
    to note an invalid entry.
     */
    public static int try_int() {
        try {
            return in.nextInt();
        } catch (Exception e) {
            return -1;
        }
    }

    public static void validateInput(String fname, String lname, int zip, String empid) {
        boolean valid = true;
        if (!atLeastTwoCharLong(fname)) {
            valid = false;
            System.out.println("The first name most be at least 2 characters long.");
        }

        if (!atLeastTwoCharLong(lname)) {
            valid = false;
            System.out.println("The last name must be at least 2 characters long.");
        }

        if (!filledIn(fname)) {
            valid = false;
            System.out.println("The first name must be filled in.");
        }

        if (!filledIn(lname)) {
            valid = false;
            System.out.println("The last name must be filled in.");
        }

        if (!validEmpID(empid)) {
            valid = false;
            System.out.println("The employee ID must be in the format of AA-1234.");
        }

        if (!validZip(zip)) {
            valid = false;
            System.out.println("The zipcode must be a 5 digit number.");
        }

        if (valid) {
            System.out.println("There were no errors found.");
        }
    }

    public static boolean atLeastTwoCharLong(String str) {
        return str.length() >= 2;
    }

    public static boolean filledIn(String str) {
        return str.length() > 0;
    }

    /* see try_int() */
    public static boolean validZip(int zip) {
        return zip != -1;
    }

    public static boolean validEmpID(String empid) {
        return empid.matches("[A-Z]{2}-[0-9]{4}");
    }

    public static void main(String[] args) {
        in = new Scanner(System.in);
        System.out.print("Enter the first name:");
        String fname = in.nextLine();
        System.out.print("Enter the last name:");
        String lname = in.nextLine();
        System.out.print("Enter the ZIP code:");
        int zip = try_int();
        in.nextLine();
        System.out.print("Enter the employee ID:");
        String empID = in.nextLine();
        validateInput(fname, lname, zip, empID);
    }
}
