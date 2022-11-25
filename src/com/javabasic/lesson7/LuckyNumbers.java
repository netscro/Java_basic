package com.javabasic.lesson7;

public class LuckyNumbers {

    static int unluckyNumber1 = 4;
    static int unluckyNumber2 = 9;

    static int maxRangeValue = 100;

    static String stringNumber;

    public static void main(String[] args) {

        String strUnluckyNumber1 = intToString(unluckyNumber1);
        String strUnluckyNumber2 = intToString(unluckyNumber2);

        for (int i = 0; i <= maxRangeValue; i++) {
            stringNumber = intToString(i);
            if (!stringNumber.contains(strUnluckyNumber1) && !stringNumber.contains(strUnluckyNumber2)) {
                System.out.println(stringNumber);
            }
        }
    }

    public static String intToString(int number) {
        return Integer.toString(number);
    }

}
