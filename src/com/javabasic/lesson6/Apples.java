package com.javabasic.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Apples {
    static int bigJars;
    static int middleJars;
    static int smallJars;
    static int applesForNextJar;

    static int applesForBigJar = 5;
    static int applesForMiddleJar = 3;

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("How many apples do you have?");
        int intFromUser = isPositive();

        getJarsForApples(intFromUser);

        System.out.printf("Big Jars is: %s\n", bigJars);
        System.out.printf("Middle Jars is: %s\n", middleJars);
        System.out.printf("Small Jars is: %s", smallJars);

    }

    public static int isPositive() throws IOException {

        boolean isInt = false;
        int intValue = 0;

        while (!isInt) {

            String getValueFromUser = reader.readLine();

            try {
                intValue = Integer.parseInt(getValueFromUser);
                if (intValue > 0) {
                    isInt = true;
                } else {
                    System.out.print("Error. Please input an Integer higher than 0: ");
                }

            } catch (NumberFormatException e) {
                System.out.print("Incorrect data type. Please input Integer: ");
            }

        }

        return intValue;
    }

    public static int[] getCountOfJars(int userInputValue, int maxApplesForJar) {

        int jars = 0;
        int apples = userInputValue;

        do {
            jars++;
            apples -= maxApplesForJar;
        } while (apples >= maxApplesForJar);

        if (apples == 0) {
            return new int[]{jars};
        } else {
            return new int[]{jars, apples};
        }

    }

    public static void getJarsForApples(int allApples) {

        if (allApples >= applesForBigJar) {
            int[] getBigJars = getCountOfJars(allApples, applesForBigJar);

            if (getBigJars.length != 1) {
                applesForNextJar = getBigJars[1];
            }
            bigJars = getBigJars[0];

            if (applesForNextJar != 0 && applesForNextJar >= applesForMiddleJar) {
                int[] getMidJars = getCountOfJars(applesForNextJar, applesForMiddleJar);

                if (getMidJars.length != 1) {
                    applesForNextJar = getMidJars[1];
                }
                middleJars = getMidJars[0];
            }

            if (applesForNextJar < applesForMiddleJar) {
                smallJars = applesForNextJar;
            }
        } else {

            if (allApples >= applesForMiddleJar) {
                int[] getMidJars = getCountOfJars(allApples, applesForMiddleJar);

                if (getMidJars.length != 1) {
                    smallJars = getMidJars[1];
                }
                middleJars = getMidJars[0];
            } else {
                smallJars = allApples;
            }
        }

    }


}
