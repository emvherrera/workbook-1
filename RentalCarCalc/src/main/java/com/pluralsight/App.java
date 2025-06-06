package com.pluralsight;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        //Constants (0_o')
        final double baseRate = 29.99;
        final double electronicTollTagCost = 3.95;
        final double gpsCost = 2.95;
        final double roadSideAssistanceCost = 3.95;
        final double underageSurchargeCost = 0.30;
        final int underAgeThreshold = 25;


        //CUSTOMER INPUT :P
        System.out.println("Enter a pick up date, or don't. I don't care. (e.g. 04/14/2025): ");
        String pickUpDate = input.nextLine();

        System.out.println("Enter number of days for the rental! NNEEOOOONNNNN ");
        Integer rentalDays = input.nextInt();

        System.out.println("Do you want an electronic toll tag silly boy ($3.95/day)? (otay / ono ): ");
        String tollTag = input.nextLine();
        input.nextLine();
        System.out.println("Do you want GPS bc you have bad memory (@2.95/day)? (otay / ono ): ");
        String gps = input.nextLine();

        System.out.println("Do you want road side assistance ($3.95/day)? (otay / ono ): ");
        String roadSide = input.nextLine();

        System.out.println("How old are you? Asking for a friend : ");
        Integer age = input.nextInt();

        System.out.println(totalCost);

        //Calculate cost :( oh dear this is going to be very hard

        double baseRental = rentalDays * baseRate;

        double optionsCost = 0.0;
        if (tollTag.equals("otay")) {
            optionsCost += rentalDays * electronicTollTagCost;
        }
        if (gps.equals("otay")) {
            optionsCost += rentalDays * gpsCost;
        }
        if (roadSide.equals("otay")) {
            optionsCost += rentalDays * roadSideAssistanceCost;
        }
        double underageSurcharge = 0.0;
        if (age < underAgeThreshold) {
            optionsCost += rentalDays * underageSurchargeCost;
        }
        double totalCost = baseRental +optionsCost +underageSurcharge;
        if
    }
    //RESULTS (HOW DID WE GET HERE, I DO NOT KNOW)

