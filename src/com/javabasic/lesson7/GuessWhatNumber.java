package com.javabasic.lesson7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GuessWhatNumber {

    static int minRangeValue = 0;
    static int maxRangeValue = 10;

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        int computerNumber = getRandomInt();
        System.out.print("What number did the computer choose? ");
        int intFromUser = getInt();
        System.out.println("computerNumber: " + computerNumber);

        if (intFromUser != computerNumber) {
            int temp;
            do {
                System.out.print("Wrong number! Try again: ");
                temp = getInt();
            } while (computerNumber != temp);
        }

        System.out.printf("Correct! The computer chose number: %s", computerNumber);

    }

    public static int getRandomInt() {
        return (int) Math.ceil(Math.random() * maxRangeValue);
    }

    public static int getInt() throws IOException {

        String errorMessage = "Please input an Integer from 0 to 10:";

        boolean isPositive = false;
        int intValue = 0;

        do {
            String getValueFromUser = READER.readLine();
            try {
                intValue = Integer.parseInt(getValueFromUser);
                if (intValue >= minRangeValue && intValue <= maxRangeValue) {
                    isPositive = true;
                } else {
                    System.out.printf("Error. %s ", errorMessage);
                }
            } catch (NumberFormatException e) {
                System.out.printf("Incorrect data type. %s ", errorMessage);
            }
        } while (!isPositive);

        return intValue;
    }

}
