package com.pluralsight;

import java.util.Scanner;

public class App {

        public static void main(String[] args) {

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Enter first name and last name: ");
            String firstNameAndLastName = keyboard.nextLine();
            System.out.println("First and last name: " + firstNameAndLastName);

            System.out.println("Enter how many hours you worked this week: ");
            double hoursWorkedThisWeek = keyboard.nextDouble();
            System.out.println("Hours worked this week = " + hoursWorkedThisWeek);

            System.out.println("What is your hourly pay rate? ");
            double hourlyPayRate = keyboard.nextDouble();
            System.out.println("Hourly pay rate : " + hourlyPayRate);

            System.out.println(" ");
            System.out.println("Name : " + firstNameAndLastName);
            System.out.println("Gross pay = $" + hourlyPayRate * hourlyPayRate);
        }

    }
