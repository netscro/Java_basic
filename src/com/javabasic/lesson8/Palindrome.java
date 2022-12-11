package com.javabasic.lesson8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Please input String to check:");

        if (isStringPalindrome(READER.readLine())) {
            System.out.println("This string is a Palindrome.");
        } else {
            System.out.println("This string is not a Palindrome.");
        }

    }

    public static boolean isStringPalindrome(String str) {

        String strWithoutSpaces = str.replaceAll(" ", "");
        String strReversed = new StringBuilder(strWithoutSpaces).reverse().toString();

        return strWithoutSpaces.equals(strReversed);

    }

}
