package com.javabasic.lesson9;

import java.util.Arrays;

public class ZeroSort {

    static int[] arrayWithZero = {2, 1, 0, 5, 0, 9};

    public static void main(String[] args) {

        Arrays.sort(arrayWithZero);

        System.out.println(Arrays.toString(arrayWithZero));

    }

}
