/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 first_name last_name
 */
package ex28;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static int getTotal(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter a number:");
            arr[i] = in.nextInt();
        }
        System.out.printf("The total is %d\n", getTotal(arr));
    }
}
