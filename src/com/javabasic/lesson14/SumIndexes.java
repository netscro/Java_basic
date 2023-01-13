package com.javabasic.lesson14;

import java.util.Arrays;

public class SumIndexes {

    public static int[] arr = {1, 2, 3, 4, 5};
    public static int indexesSum = 5;

    public static void main(String[] args) {

        System.out.printf("Array: %s\n", Arrays.toString(arr));
        System.out.printf("Indexes sum for searching: [%s]\n", indexesSum);

        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (i != j) {
                    if ((arr[i] + arr[j]) == indexesSum) {
                        System.out.printf("Indexes are: [%s, %s]\n", i, j);
                    }
                }
            }
        }

    }

}
