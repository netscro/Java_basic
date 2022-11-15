package com.javabasic.lesson6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Operations {
    static double firstValue;
    static double secondValue;
    static double result;
    static char operator;

    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Please input two numbers for operation.");

        System.out.print("Please input first number: ");
        firstValue = getNumber();

        System.out.print("Please input second number: ");
        secondValue = getNumber();

        System.out.print("Please enter the required operator (+, -, *, /): ");
        operator = getOperator();

        getResult();

    }

    public static String getValueFromUser() throws IOException {
        return reader.readLine();
    }

    public static double getNumber() throws IOException {

        boolean getDouble = false;
        double doubleValue = 0;

        while (!getDouble) {

            try {
                doubleValue = Double.parseDouble(getValueFromUser());
                getDouble = true;
            } catch (NumberFormatException e) {
                System.out.print("Incorrect data type. Please input number: ");
            }

        }

        return doubleValue;
    }

    public static char getOperator() throws IOException {

        boolean getChar = false;
        char charValue = 0;

        while (!getChar) {

            charValue = getValueFromUser().charAt(0);

            if (charValue == '+' || charValue == '-' || charValue == '*' || charValue == '/') {
                getChar = true;
            } else {
                System.out.print("Error! Please input correct operator (+, -, *, /): ");
            }
        }

        return charValue;
    }

    public static void getResult() {

        switch (operator) {
            case '+':
                result = firstValue + secondValue;
                break;
            case '-':
                result = firstValue - secondValue;
                break;
            case '*':
                result = firstValue * secondValue;
                break;
            case '/':
                result = firstValue / secondValue;
                break;
            default:
                result = 0;
                break;
        }

        if (result == 0) {
            System.out.println("Something went wrong. Goodbye!");
            System.exit(1);
        } else {
            System.out.printf("\nThe result is: %s %s %s = %s\n", firstValue, operator, secondValue, result);
        }

    }

}