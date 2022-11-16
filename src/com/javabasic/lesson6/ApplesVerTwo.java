package com.javabasic.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ApplesVerTwo {
    static int bigJars, middleJars, smallJars;

    static int applesForBigJar = 5;
    static int applesForMiddleJar = 3;
    static int applesForSmallJar = 1;

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("How many apples do you have?");
        int intFromUser = isPositive();

        int getApplesForMiddleJar = getApples(intFromUser, applesForBigJar);
        int getApplesForSmallJar = getApples(getApplesForMiddleJar, applesForMiddleJar);

        bigJars = getCountOfJars(intFromUser, applesForBigJar);
        middleJars = getCountOfJars(getApplesForMiddleJar, applesForMiddleJar);
        smallJars = getCountOfJars(getApplesForSmallJar, applesForSmallJar);

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

    public static int getApples(int allApples, int maxApplesForJar) {
        return allApples % maxApplesForJar;
    }

    public static int getCountOfJars(int apples, int applesForJar){
            return apples / applesForJar;
    }

}
