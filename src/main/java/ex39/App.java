package ex39;

import java.util.Arrays;
import java.util.HashMap;

class Employee {
    String fname;
    String lname;
    String position;
    String date;

    public Employee(String fname, String lname, String position, String date) {
        this.fname = fname;
        this.lname = lname;
        this.position = position;
        this.date = date;
    }
}

public class App {

    public static void printTable(HashMap<String, Employee> employees, String[] lnames) {
        System.out.println("Name                 | Position          | Separation Date");
        System.out.println("---------------------|-------------------|----------------");

        for (int i = 0; i < lnames.length; i++) {
            Employee e = employees.get(lnames[i]);
            System.out.printf("%-20s | %-15s | %-20s\n", e.fname, e.lname, e.position, e.date);
        }
    }

    public static void main(String[] args) {
        String[] lnames = {"Johnson", "Xiong", "Michaelson", "Jacobson", "Jackson", "Webber"};
        Arrays.sort(lnames);

        HashMap<String, Employee> employees = new HashMap<String, Employee>();
        employees.put(lnames[0], new Employee("Jacquelyn", lnames[0], "DBA", ""));
        employees.put(lnames[1], new Employee("Jake", lnames[1], "Programmer", ""));
        employees.put(lnames[2], new Employee("John", lnames[2], "Manager", "2016-12-31"));
        employees.put(lnames[3], new Employee("Michaela", lnames[3], "District Manager", "2015-12-19"));
        employees.put(lnames[4], new Employee("Sally", lnames[4], "Web Developer", "2015-12-18"));
        employees.put(lnames[5], new Employee("Tou", lnames[5], "Software Engineer", "2016-10-05"));
    }
}