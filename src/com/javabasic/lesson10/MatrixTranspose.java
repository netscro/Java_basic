package com.javabasic.lesson10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MatrixTranspose {

    final static BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    static int matrixSizeM;
    static int matrixSizeN;

    public static void main(String[] args) throws IOException {

        System.out.print("Please input Matrix size M: ");
        matrixSizeM = getInt();
        System.out.print("Please input Matrix size N: ");
        matrixSizeN = getInt();

        int[][] matrixArray = new int[matrixSizeM][matrixSizeN];
        int[][] transposedMatrix = new int[matrixSizeN][matrixSizeM];

        fillArrayByUser(matrixArray);
        fillTransposedArray(matrixArray, transposedMatrix);

        System.out.println("Your Matrix is:");
        printMatrix(matrixArray);

        System.out.println("The transposed Matrix is:");
        printMatrix(transposedMatrix);

    }

    public static int getInt() throws IOException {

        boolean isInt = false;
        int intValue = 0;

        while (!isInt) {
            String getValueFromUser = READER.readLine();
            isInt = true;
            try {
                intValue = Integer.parseInt(getValueFromUser);
            } catch (NumberFormatException e) {
                System.out.print("Incorrect data type. Please input Integer: ");
            }
        }

        return intValue;
    }

    public static void fillArrayByUser(int[][] array) throws IOException {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("Please input value for Array [%s] index [%s]: ", i, j);
                array[i][j] = getInt();
            }
        }
    }

    public static void printMatrix(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.printf("%2d", array[i][j]);
            }
            System.out.println();
        }
    }

    public static void fillTransposedArray(int[][] originalArray, int[][] arrayForTranspose) {
        for (int i = 0; i < arrayForTranspose.length; i++) {
            for (int j = 0; j < arrayForTranspose[i].length; j++) {
                arrayForTranspose[i][j] = originalArray[j][i];
            }
        }
    }

}
