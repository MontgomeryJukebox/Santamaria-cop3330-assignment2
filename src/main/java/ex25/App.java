/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex25;

import java.util.Scanner;

public class App {
    public static int validatePassword(String password) {
        boolean numeric = false, alphanumeric = false, small = false, special = false;
        if (password.length() < 8) {
            small = true;
        } else {
            small = false;
        }
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numeric = true;
            } else if (Character.isAlphabetic(password.charAt(i))) {
                alphanumeric = true;
            } else {
                special = true;
            }
        }
        if (small) {
            if (!alphanumeric) {
                return 0;
            }
            return 1;
        }
        if (alphanumeric && numeric && !special) {
            return 2;
        }
        return 3;
    }

    public static void printPasswordStrength(String password) {
        int strength = validatePassword(password);
        System.out.print("The password '" + password + "' is a ");
        switch (strength) {
            case 0:
                System.out.print("very weak");
                break;
            case 1:
                System.out.print("weak");
                break;
            case 2:
                System.out.print("strong");
                break;
            case 3:
                System.out.print("very strong");
                break;
        }
        System.out.println(" password");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        printPasswordStrength("12345");
        printPasswordStrength("abcdef");
        printPasswordStrength("abc123xyz");
        printPasswordStrength("1337h@xor!");
    }
}
