/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Yohan Hmaiti
 */


// This program computes simple interest.
// Prompts for the principal amount, the rate as a percentage,
// and the time, and displays the amount accrued (principal + interest).

package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        // Initialize scanner called scanner
        Scanner scanner = new Scanner(System.in);

        // prompt the user for the principal amount and interest rate
        // and store them accordingly
        System.out.print("Enter the principal: ");
        float principal = Float.valueOf(scanner.nextLine());
        System.out.print("Enter the rate of interest: ");
        float interestRate = Float.valueOf(scanner.nextLine());

        // check if the user entered a percentage or no
        // if not reprompt them to enter a percentage
        while (interestRate < 1) {

            System.out.print("Please enter a percentage instead:");
            interestRate = Float.valueOf(scanner.nextLine());

        }

        // convert the interest rate from percentage to decimal
        interestRate = interestRate / 100;

        // prompt the user for the number of years and store it accordingly
        System.out.print("Enter the number of years: ");
        int years = Integer.valueOf(scanner.nextLine());

        // calculate the investment according to simple interest formula provided
        float investment  = principal * (1 + interestRate * years);

        // output to the console as described by the assignment
        // ensuring that fractions of a cent are rounded up to the next penny
        System.out.print("After " + years + " years at " + (interestRate*100) + "%, the investment will be worth $" + Math.round(investment * 10)/10.0 + ".");

    }

}
