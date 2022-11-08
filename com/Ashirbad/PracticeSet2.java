package com.Ashirbad;

import java.util.Scanner;

public class PracticeSet2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Practice set 2
        //q1
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        //q2
        char grade = 'a';
        grade = (char)(grade + 10);
        System.out.println(grade);
        //Decrypting the grade
        grade = (char)(grade - 10);
        System.out.println(grade);

        //q3
        int x = sc.nextInt();
        System.out.println(x<10);

        //q4
        int v = 4;
        int u = 2;
        int b = 2;
        int s = 5;
        float y = (v*v - u*u) / (2.0f*b*s);
        System.out.println(y);

        //q5
        int c = 7*49/7 + 35/7;
        System.out.println(c);
    }
}
