package com.javabasic.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class HandLuggage {
    static int maxValue = 115;
    static int minValue = 1;
    static int maxWeight = 10;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String luggageWidth = "Width";
        String luggageHeight = "Height";
        String luggageDepth = "Depth";
        String luggageWeight = "Weight";

        double[] luggageDimensions = {floatFromString(luggageWidth), floatFromString(luggageHeight),
                floatFromString(luggageDepth)};
        float weight = floatFromString(luggageWeight);

        resultForLuggage(luggageDimensions, weight);

    }

    public static float floatFromString(String luggageDimension) throws IOException {

        boolean condition = false;
        float userValue = 0;

        while (!condition) {

            System.out.printf("Please input %s: ", luggageDimension);
            String getValueFromUser = reader.readLine();

            try {
                userValue = Float.parseFloat(getValueFromUser);

                if (userValue >= minValue && userValue <= maxValue) {
                    condition = true;
                } else {
                    System.out.println("Please input value from 1 to 115");
                }

            } catch (NumberFormatException e) {
                System.out.println("Incorrect data type. Please input numbers!");
            }

        }

        return userValue;

    }

    public static void resultForLuggage(double[] sizeArray, float weight) {

        double luggageSize = Arrays.stream(sizeArray).sum();

        if (luggageSize <= maxValue && weight <= maxWeight) {
            System.out.println("Congrats! You can get your bag as hand luggage.");
        } else {
            System.out.println("Unfortunately, your luggage does not fit the dimensions of hand luggage.");
        }

    }

}
