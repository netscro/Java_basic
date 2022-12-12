package com.javabasic.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arrays {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    static String[] mainArray = new String[20];

    static String[] firstArray = new String[10];
    static String[] secondArray = new String[10];

    public static void main(String[] args) throws IOException {

        fillArray(mainArray);
        firstArray = java.util.Arrays.copyOfRange(mainArray, 0, firstArray.length);
        secondArray = java.util.Arrays.copyOfRange(mainArray, secondArray.length, mainArray.length);

    }

    public static void fillArray(String[] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            System.out.println("Please input String. Index = " + i);
            String stringFromUser = READER.readLine();
            array[i] = stringFromUser;
        }
    }

}
