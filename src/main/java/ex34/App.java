/*
 *  UCF COP3330 Summer 2021 Assignment 2 Solution
 *  Copyright 2021 David Santamaria
 */
package ex34;

import java.util.ArrayList;
import java.util.Scanner;

public class App {

    public static void printEmps(ArrayList<String> e) {
        System.out.printf("There are %d employees:\n", e.size());
        for (int i = 0; i < e.size(); i++) {
            System.out.println(e.get(i));
        }
    }

    public static void removeEmp(ArrayList<String> e, String emp) {
        boolean found = false;
        for (int i = 0; i < e.size(); i++) {
            if (e.get(i).compareTo(emp) == 0) {
                e.remove(i);
                found = true;
            }
        }
        if (!found) {
            System.out.printf("Employee %s not found\n", emp);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<String> employees = new ArrayList<String>();
        employees.add("John Smith");
        employees.add("Jackie Jackson");
        employees.add("Chris Jones");
        employees.add("Amanda Cullen");
        employees.add("Jeremy Goodwin");

        printEmps(employees);

        System.out.println();
        System.out.print("Enter an employee name to remove: ");
        String emp = in.nextLine();

        removeEmp(employees, emp);

        printEmps(employees);
    }
}
