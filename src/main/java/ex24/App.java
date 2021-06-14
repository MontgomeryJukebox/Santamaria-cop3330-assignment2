/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex24;

import java.util.Scanner;

public class App {
    public static boolean isAnagram(String a, String b) {
        int[] acnt = new int[26];
        int[] bcnt = new int[26];
        if (a.length() != b.length()) {
            return false;
        }
        for (int i = 0; i < a.length(); i++) {
            acnt[Character.toLowerCase(a.charAt(i)) - 'a']++;
            bcnt[Character.toLowerCase(b.charAt(i)) - 'a']++;
        }
        for (int i = 0; i < acnt.length; i++) {
            if (acnt[i] != bcnt[i]) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter two strings and I'll tell you if they are anagrams:");
        System.out.print("Enter the first string:");
        String first = in.next();
        System.out.print("Enter the second string:");
        String second = in.next();
        if (isAnagram(first, second)) {
            System.out.printf("\"%s\" and \"%s\" are anagrams.", first, second);
        } else {
            System.out.printf("\"%s\" and \"%s\" are not anagrams.", first, second);
        }
    }
}
