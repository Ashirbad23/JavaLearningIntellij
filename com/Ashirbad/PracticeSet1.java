package com.Ashirbad;

import java.util.Scanner;

public class PracticeSet1 {
    public static void main(String[] args) {
        //Practice set 1
        //q1
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String n = sc.nextLine();
        System.out.println("Hi " + n + ", Have a nice day");

        //q2
        //Kilometer to Miles convertor
        System.out.println("Write the Kilometer:");
        double km = sc.nextFloat();
        double mi = km * 0.621371;
        System.out.println(km + "km= " + mi + "miles");

        //q3
        int a = 5;
        int b = 1;
        int c = 4;
        int k = (b*b - 4*a*c) /(2*a);
        System.out.println(k);
    }
}
