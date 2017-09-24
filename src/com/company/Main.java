package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // write your code here
        Scanner scan = new Scanner(System.in);
        String answer;
        int correctCount = 0;

        System.out.print("What was the famine that caused many of the Irish to come to America? ");
        answer = scan.next();

        if(answer.equalsIgnoreCase("potato") || answer.equalsIgnoreCase("potato famine")) {
            correctCount++;
            System.out.println("You are correct!");
        }else
            System.out.println("You are incorrect");

        System.out.print("Who won the American Revolution? ");
        answer = scan.next();

        if(answer.equalsIgnoreCase("america")) {
            correctCount++;
            System.out.println("You are correct!");
        }else
            System.out.println("You are incorrect");

        System.out.print("Who did Rome fight in the Punic Wars? ");
        answer = scan.next();

        if(answer.equalsIgnoreCase("Carthage")) {
            correctCount++;
            System.out.println("You are correct!");
        }else
            System.out.println("You are incorrect");

        System.out.print("Which Emperor legalized Christianity in the Roman Empire? ");
        answer = scan.next();

        if(answer.equalsIgnoreCase("Constantine") ) {
            correctCount++;
            System.out.println("You are correct!");
        }else
            System.out.println("You are incorrect");

        System.out.print("Name one of the two brothers who supposedly founded Rome? ");
        answer = scan.next();

        if(answer.equalsIgnoreCase("romulus") || answer.equalsIgnoreCase("Remus")) {
            correctCount++;
            System.out.println("You are correct!");
        }else
            System.out.println("You are incorrect");

        System.out.println("Your score is " + correctCount + "/5");
    }
}
