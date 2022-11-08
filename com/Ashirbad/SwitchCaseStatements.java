package com.Ashirbad;
import java.util.Scanner;
public class SwitchCaseStatements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How do you want to start our conversation?");
        String var = sc.nextLine();

        switch (var) {
            case "Hi" -> System.out.println("Hey man! Nice to meet you");
            case "Hello" -> System.out.println("Hi! how are you?");
            case "Nice to meet you!" -> System.out.println("Nice to meet you too!");
            default -> System.out.println("Nice to meet you!");
        }
        System.out.println("I am Ashirbad");



       /*
       System.out.println("What is your age?");
        int age = sc.nextInt();

        if(age > 50){
            System.out.println("You are experienced");
        }
        else if (age > 40) {
            System.out.println("You are semi experienced");
        }
        else if (age > 30){
            System.out.println("You are semi-semi experienced");
        }
        else {
            System.out.println("You are a fresher");
        }
        */
    }
}
