package com.javabasic.lesson10;

public class NonPositiveArrayIndexes {

    static int[][] arr = {{-1, 3, 5, -5}, {7, 25, -350, 6}, {-4, 4, -3, 1}};

    public static void main(String[] args) {
        System.out.println("The indexes of negative values are:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < 0) {
                    System.out.printf("[%s][%s]\n", i, j);
                }
            }
        }
    }

}
