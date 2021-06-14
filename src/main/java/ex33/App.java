/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex33;

import java.util.Random;
import java.util.Scanner;

public class App {

    public static String getArrayIndex(String[] arr, int i) {
        return arr[i];
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Random r = new Random();
        String[] responses = new String[]{"Yes", "No", "Maybe", "Ask again later."};
        System.out.print("What's your question?\n>");
        in.nextLine();
        System.out.println(getArrayIndex(responses, r.nextInt(responses.length)));
    }
}
