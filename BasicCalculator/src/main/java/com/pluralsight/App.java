package com.pluralsight;

import java.sql.SQLOutput;
import java.util.Scanner;


public class App {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        //first number
        System.out.println("Enter first number!");
        double firstNumber = myScanner.nextDouble();

        // second number
        System.out.println("Enter second number!");
        double secondNumber = myScanner.nextDouble();

        // operations options
        System.out.println("Possible calculations?");
        System.out.println("(A)dd");
        System.out.println("(S)ubtract");
        System.out.println("(M)ultiply");
        System.out.println("(D)ivide");
        System.out.println("Please select an option: ");

        String choice = myScanner.next();

        if (choice.equals("A")) {
            double additionResult = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + additionResult);

        } else if (choice.equals("S")) {
            double subtractionResult = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + subtractionResult);
        } else if (choice.equals("M")) {
            double multiplicationResult = firstNumber * secondNumber;
            System.out.println(firstNumber + " x " + secondNumber + " = " + multiplicationResult);
        }  else if (choice.equals("D")) {
            double divisionResult = firstNumber / secondNumber;
            System.out.println( firstNumber + " / " + secondNumber + " = " + divisionResult);
        }


    }
}
