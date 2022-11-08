package com.Ashirbad;

import java.util.Scanner;

public class PracticeSet3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Practice set 3
        //q1
        String name = "ASH Ketchum";
        name = name.toLowerCase();
        System.out.println(name);

        //q2
        String text = "The World is in my Hand";
        text = text.replace(' ','_');
        System.out.println(text);

        //q3
        System.out.print("Write the name: ");
        String letter = "Dear <|name|>, thanks a lot!";
        letter = letter.replace("<|name|>",sc.next());
        System.out.println(letter);

        //q4
        String mst = "This string has double  or triple spaces.";
        System.out.println(mst.indexOf("  "));
        System.out.println(mst.indexOf("   "));

        //q5
        String mletter = "Dear Harry Bhai, \n\tYour java course is very very nice. We got\n to learn so much. \nThanks a lot☺";
        System.out.println(mletter);
    }
}
