/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex37;

import java.util.*;

public class App {

    public static ArrayList<Character> toList(String s) {
        ArrayList<Character> ret = new ArrayList<Character>();
        for (char a : s.toCharArray()) {
            ret.add(a);
        }
        return ret;
    }

    public static String listToArr(ArrayList<Character> l) {
        StringBuilder s = new StringBuilder();
        for (char c : l) {
            s.append(c);
        }
        return s.toString();
    }

    public static String generatePasswd(int length, int special, int numbers) {
        Random r = new Random();
        String ret = "";
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();

        for (int i = 0; i < special; i++) {
            ret += (char) (r.nextInt(0xB4 - 21 + 1) + 21);
        }
        for (int i = 0; i < numbers; i++) {
            ret += r.nextInt(10);
        }
        for (int i = ret.length(); i < length; i++) {
            if (r.nextInt(2) % 1 == 0) {
                ret += alphabet[r.nextInt(alphabet.length)];
            } else {
                ret += Character.toUpperCase(alphabet[r.nextInt(alphabet.length)]);
            }
        }

        System.out.println("debug: " + ret);

        ArrayList<Character> tmp = toList(ret);
        Collections.shuffle(tmp);
        return listToArr(tmp);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("What's the minimum length?");
        int length = in.nextInt();
        System.out.print("How many special characters?");
        int special = in.nextInt();
        System.out.print("How many numbers?");
        int nums = in.nextInt();
        System.out.printf("Your password is %s\n", generatePasswd(length, special, nums));
    }
}
