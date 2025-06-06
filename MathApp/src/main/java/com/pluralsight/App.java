package com.pluralsight;
import java.awt.*;

public class App {
    public static void main(String[] args) {
//        QUESTION 1
// Variables representing Bob and Gary's salary
        int bobAnnualSalary = 136000;
        int garyYAnnualSalary = 116000;
        int highestAnnualSalary = Math.max(bobAnnualSalary, garyYAnnualSalary);
        System.out.println("The highest salary is " + highestAnnualSalary);

//        QUESTION 2
        int carPrice = 18000;
        int truckPrice = 64000;
        int cheaperVehicle = Math.min(carPrice, truckPrice);
        System.out.println("The cheaper vehicle is " + cheaperVehicle);

//        QUESTION 3
        double radiusOfCircle = 7.25;
        double radiusSquared = Math.pow(radiusOfCircle, 2);
        double areaOfCircle = Math.PI * radiusSquared;
        System.out.println("The area of the circle is " + areaOfCircle + "!");


//        QUESTION 4
        double number = 5.0; // Sets the variable to 5.0
        double squareRoot = Math.sqrt(number); // Finds the square root
        System.out.println("The square root " + "is " + squareRoot);

//        QUESTION 5

        int x1 = 5;   //Calculate differences
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;

        int dx = x2 - x1; //Calculate differences
        int dy = y2 - y1;

        double distance = Math.sqrt(Math.pow(dx, 2) + Math.pow(dy, 2)); //Distance formula
        System.out.println("The distance between the point is " + distance);

//        QUESTION 6
        // Absolute value of -3.8 = 3.8 - Just the positive, no matter what
        double number1 = -3.8;
        double absoluteValue = Math.abs(number1);
        System.out.println("The absolute value of " + number1 + " is " + " " + absoluteValue);

//        QUESTION 7
        // Find and display a random number between 0 and 1
        double randomNumber = Math.random(); // Gives you a random number
        System.out.println("Random number between 0 and 1:" + randomNumber);

    }
}

