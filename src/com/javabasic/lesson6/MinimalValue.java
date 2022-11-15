package com.javabasic.lesson6;

import java.util.Arrays;
import java.util.OptionalDouble;

public class MinimalValue {

    public static void main(String[] args) {

        double[] valuesList = {5.5, 2, 4.6};

        double minimalValue = getMinimalDouble(valuesList);

        getResult(minimalValue);

    }

    public static double getMinimalDouble(double[] valuesList) {
        OptionalDouble minimalValue = Arrays.stream(valuesList).min();

        if (minimalValue.isEmpty()) {
            return 0;
        }
        else {
            return minimalValue.getAsDouble();
        }
    }

    public static boolean isInt(double value) {

        boolean is_result;

        is_result = value % 1 == 0;

        return is_result;
    }

    public static void getResult(double value) {

        int intMinimalValue;
        if (isInt(value)) {
            intMinimalValue = (int) value;
            System.out.println(intMinimalValue);
        } else {
            System.out.println(value);
        }
    }

}
