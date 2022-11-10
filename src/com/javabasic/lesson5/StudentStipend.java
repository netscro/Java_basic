package com.javabasic.lesson5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class StudentStipend {
    static int highScore = 10;
    static int middleScore = 8;

    static int maximumMark = 12;
    static int minimalMark = 1;
    static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        String subjectMath = "Math";
        String subjectInformatics = "Informatics";
        String subjectAlgebra = "Algebra";
        String subjectLiterature = "Literature";
        String subjectPhysics = "Physics";

        int[] marksArray = {intFromString(subjectMath), intFromString(subjectInformatics),
                intFromString(subjectAlgebra), intFromString(subjectLiterature), intFromString(subjectPhysics)};

        resultForStudentStipend(marksArray);
    }

    public static int intFromString(String studiedSubject) throws IOException {

        boolean condition = false;
        int markRes = 0;

        while (!condition) {

            System.out.printf("Please input mark for %s: ", studiedSubject);
            String getMarkFromUser = reader.readLine();

            try {
                markRes = Integer.parseInt(getMarkFromUser);

                if (markRes >= minimalMark && markRes <= maximumMark) {
                    condition = true;
                } else {
                    System.out.println("Please input value from 1 to 12");
                }

            } catch (NumberFormatException e) {
                System.out.println("Incorrect data type. Please input an integer!");
            }

        }

        return markRes;

    }

    public static void resultForStudentStipend(int[] marksArray) {

        float middleStudentScore = (float) Arrays.stream(marksArray).sum() / marksArray.length;
        System.out.println("Your middle score is: " + middleStudentScore);

        if (middleStudentScore >= highScore) {
            System.out.println("You will get the High Stipend! Congrats!");
        } else if (middleStudentScore >= middleScore && middleStudentScore < highScore) {
            System.out.println("You will get the Middle Stipend! Not Bad. Congrats.");
        } else {
            System.out.println("You won't get the Stipend. You have to study harder!");
        }

    }

}
