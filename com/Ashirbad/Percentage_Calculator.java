package com.Ashirbad;

import java.util.Scanner;

public class Percentage_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Physics mark");
        float p = sc.nextFloat();
        System.out.println("Enter your Chemistry mark");
        float c = sc.nextFloat();
        System.out.println("Enter your Mathematics mark");
        float m = sc.nextFloat();
        System.out.println("Enter your English mark");
        float e = sc.nextFloat();
        System.out.println("Enter your Physical Education mark");
        float pe = sc.nextFloat();
        System.out.println("Enter your Biology mark");
        float b = sc.nextFloat();

        float sum = p + c + m + e + pe + b;
        System.out.println("Total marks of the exam");
        float total = sc.nextFloat();
        System.out.println("Total marks you achieved: " + sum + "/" + total);
        float div = sum / total;
        float per = div * 100;
        System.out.println("Percentage achieved: " + per + "%");
        float cgpa = div * 10;
        System.out.println("Your CGPA: " + cgpa);
    }
}
