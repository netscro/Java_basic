package com.javabasic.lesson9;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Lottery {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    static int arrayLength = 7;
    static int maxValue = 9;
    static int minValue = 0;
    static int counter = 0;

    static int[] lotteryArray = new int[arrayLength];
    static int[] userArray = new int[arrayLength];

    public static void main(String[] args) throws IOException {

        System.out.println("Please input numbers:");

        fillArrayByUser(userArray);
        fillArrayRandom(lotteryArray);

        compareArrays(lotteryArray, userArray);

        System.out.println(Arrays.toString(lotteryArray));
        System.out.println(Arrays.toString(userArray));
        System.out.println("Number of matches: " + counter);


    }

    public static int getInt() throws IOException {

        boolean isPositive = false;
        int intValue = 0;

        while (!isPositive) {

            String getValueFromUser = READER.readLine();

            try {
                intValue = Integer.parseInt(getValueFromUser);
                if (intValue >= 0) {
                    isPositive = true;
                } else {
                    System.out.print("Error. Please input a positive Integer: ");
                }

            } catch (NumberFormatException e) {
                System.out.print("Incorrect data type. Please input Integer: ");
            }

        }

        return intValue;
    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void fillArrayRandom(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber(minValue, maxValue);
        }
    }

    public static void fillArrayByUser(int[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            array[i] = getInt();
        }
    }

    public static void compareArrays(int[] array1, int[] array2) {

        Arrays.sort(array1);
        Arrays.sort(array2);

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == array2[i]) {
                counter++;
            }
        }
    }

}
