/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex38;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter a list of numbers, separated by spaces: ");
        String s = in.nextLine();
        ArrayList<Integer> nums = generateEvensList(s);
        System.out.print("The even numbers are ");
        for (int i : nums) {
            System.out.print(i + " ");
        }
    }

    public static ArrayList<Integer> generateEvensList(String s) {
        char[] arr = s.toCharArray();
        ArrayList<Integer> ret = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != ' ' && (arr[i] - '0') % 2 == 0) {
                ret.add(arr[i] - '0');
            }
        }
        return ret;
    }
}
