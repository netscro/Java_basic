package com.javabasic.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class CarWash {

    static int count;
    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException, InterruptedException {

        System.out.println("How many cars need to wash?");
        int countOfCarsToWash = getInt();

        System.out.printf("### The washing is started for cars: %s ###\n", countOfCarsToWash);
        // first way with for
        for (int i = 1; i <= countOfCarsToWash; i++) {
            System.out.println("Washing a car: " + i);
            printStageSoap();
            TimeUnit.SECONDS.sleep(2);
            printStageWater();
            TimeUnit.SECONDS.sleep(2);
            printStageDry();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("The car is washed");
            if (i < countOfCarsToWash) {
                System.out.println("* Going to wash the next car *");
                TimeUnit.SECONDS.sleep(3);
            }
        }
        // second way with do
        do {
            count++;
            System.out.println("Washing a car: " + count);
            printStageSoap();
            TimeUnit.SECONDS.sleep(2);
            printStageWater();
            TimeUnit.SECONDS.sleep(2);
            printStageDry();
            TimeUnit.SECONDS.sleep(1);
            System.out.println("The car is washed");
            if (count < countOfCarsToWash) {
                System.out.println("* Going to wash the next car *");
                TimeUnit.SECONDS.sleep(3);
            }
        } while (count != countOfCarsToWash);

        System.out.println("### The washing is finished. Cars are ready to use ###");

    }

    public static int getInt() throws IOException {

        boolean isPositive = false;
        int intValue = 0;

        while (!isPositive) {

            String getValueFromUser = READER.readLine();

            try {
                intValue = Integer.parseInt(getValueFromUser);
                if (intValue > 0) {
                    isPositive = true;
                } else {
                    System.out.print("Error. Please input an Integer higher than 0: ");
                }

            } catch (NumberFormatException e) {
                System.out.print("Incorrect data type. Please input Integer: ");
            }

        }

        return intValue;
    }

    public static void printStageSoap() {
        System.out.println("The car is soaped");
    }

    public static void printStageWater() {
        System.out.println("The car is washed");
    }

    public static void printStageDry() {
        System.out.println("The car is dried");
    }

}
