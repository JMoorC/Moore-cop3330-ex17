/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 James Moore
 */

import java.util.Scanner;

public class ex17 {
    public static void main(String[] args){
        Scanner inScan = new Scanner(System.in);

        System.out.print("Enter 1 if you are male or 2 if you are female: ");
        while (!inScan.hasNextInt() ){
            inScan.next();
            System.out.print("Please enter an appropriate number.\nEnter 1 if you are male or 2 if you are female: ");
        }
        int gender = inScan.nextInt();
        if (gender < 1 || gender > 2){
            gender = 2;
        }

        System.out.print("How many ounces of alcohol did you have? ");
        while (!inScan.hasNextInt() ){
            inScan.next();
            System.out.print("Please enter a whole number\nHow many ounces of alcohol did you have? ");
        }
        int intake = inScan.nextInt();

        System.out.print("What is your weight, in pounds? ");
        while (!inScan.hasNextInt() ){
            inScan.next();
            System.out.print("Please enter a whole number\nWhat is your weight, in pounds? ");
        }
        int weight = inScan.nextInt();

        System.out.print("How many hours has it been since your last drink? ");
        while (!inScan.hasNextInt() ){
            inScan.next();
            System.out.print("Please enter a whole number\nHow many hours has it been since your last drink? ");
        }
        int hours = inScan.nextInt();

        double ratio = 0.66;
        if (gender == 1){
            ratio =0.73;
        }
        double bac = ( ( (5.14 * intake) / weight) * ratio ) - (0.015 * hours);
        String answer = (bac < 0.08)? "It is legal for you to drive." : "It is illegal for you to drive.";
        System.out.printf("Your Bac is %.6f\n" + answer + "\n", bac);

    }
}
