package com.Ashirbad;

import java.util.Scanner;

public class Conditionals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("What is your age: ");
        int age = sc.nextInt();
        if(age >= 18){
            System.out.println("Yes, you are eligible to drive.");
        }
        else {
            System.out.println("No, you are not eligible to drive.");
        }

    }
}
