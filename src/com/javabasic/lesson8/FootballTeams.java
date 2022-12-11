package com.javabasic.lesson8;

import java.util.Arrays;

public class FootballTeams {

    static int maxTeamPlayers = 11;
    static int minTeamMemberAge = 18;
    static int maxTeamMemberAge = 45;

    static int[] firstTeam = new int[maxTeamPlayers];
    static int[] secondTeam = new int[maxTeamPlayers];

    public static void main(String[] args) {

        fillArray(firstTeam);
        fillArray(secondTeam);

        int middleAgeFirstTeam = getMiddleTeamAge(firstTeam);
        int middleAgeSecondTeam = getMiddleTeamAge(secondTeam);

        System.out.println("First Team: " + Arrays.toString(firstTeam));
        System.out.println("Second Team: " + Arrays.toString(secondTeam));

        if (middleAgeFirstTeam != middleAgeSecondTeam) {
            if (middleAgeFirstTeam > middleAgeSecondTeam) {
                System.out.println("Max age in a first team = " + middleAgeFirstTeam);
            } else {
                System.out.println("Max age in a second team = " + middleAgeSecondTeam);
            }
        } else {
            System.out.println("The middle age of players the same in both teams.");
        }

    }

    public static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = getRandomNumber(minTeamMemberAge, maxTeamMemberAge);
        }
    }

    public static int getMiddleTeamAge(int[] array) {
        return Arrays.stream(array).sum() / array.length;
    }

}
