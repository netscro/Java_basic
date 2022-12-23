package com.javabasic.lesson10;

public class Factorial {

    static int number;

    public static void main(String[] args) {

        number = 7;
        System.out.println(getFactorial(number));

    }

    public static int getFactorial(int number) {
        int breakValue = 1;
        if (number == breakValue) {
            return breakValue;
        }
        return number * getFactorial(number - breakValue);
    }

}
