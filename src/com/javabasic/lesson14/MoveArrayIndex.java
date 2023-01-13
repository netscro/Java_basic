package com.javabasic.lesson14;

import java.util.Arrays;

public class MoveArrayIndex {

    public static int[] arr = {1, 2, 3, 4, 5};

    public static int moveNumber = 2;

    public static void main(String[] args) {
        System.out.printf("Array: %s\n", Arrays.toString(arr));
        System.out.printf("Count of last indexes to move: [%s]\n", moveNumber);
        System.out.printf("Updated array: %s\n", Arrays.toString(getUpdatedArr(arr)));
    }

    public static int[] getUpdatedArr(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < moveNumber; i++) {
            newArr[i] = arr[(arr.length - 1) - i];
        }

        for (int i = 0; i < (arr.length - moveNumber); i++) {
            newArr[moveNumber + i] = arr[i];
        }
        return newArr;
    }


}
