package com.javabasic.lesson15;

import com.javabasic.lesson15.interfaces.Converter;
import com.javabasic.lesson15.temperaturetypes.Fahrenheit;
import com.javabasic.lesson15.temperaturetypes.Kelvin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DegreeConverter {

    private final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.print("Please input degrees: ");
        double degree = getDouble();
        System.out.print("Please chose type to convert: \n");
        System.out.println("Fahrenheit - 1");
        System.out.println("Kelvin     - 2");
        int degreeToConvert = getInt();
        Converter converter = createConverter(degreeToConvert);
        System.out.printf("Degrees in %s: %s\n", converter.getClass().getSimpleName(), converter.convert(degree));
    }

    public static Converter createConverter(int degreeToConvert) {
        switch (degreeToConvert) {
            case 1:
                return new Fahrenheit();
            case 2:
                return new Kelvin();
            default:
                throw new IllegalArgumentException("Only Available: 1 or 2 option.");
        }
    }

    private static double getDouble() throws IOException {

        boolean isDouble = false;
        double doubleValue = 0;

        while (!isDouble) {
            String getValueFromUser = READER.readLine();
            try {
                doubleValue = Double.parseDouble(getValueFromUser);
                isDouble = true;
            } catch (NumberFormatException e) {
                System.out.print("Incorrect data type. Please input Double: ");
            }
        }

        return doubleValue;
    }

    private static int getInt() throws IOException {

        boolean isInt = false;
        int intValue = 0;

        while (!isInt) {
            String getValueFromUser = READER.readLine();
            try {
                intValue = Integer.parseInt(getValueFromUser);
                isInt = true;
            } catch (NumberFormatException e) {
                System.out.print("Incorrect data type. Please input Integer: ");
            }
        }

        return intValue;
    }

}
