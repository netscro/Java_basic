package com.javabasic.lesson13;

import java.util.Random;

public class PersonGenerator {

    private static int minAge = 18;
    private static int maxAge = 65;
    private static int minWeight = 45;
    private static int maxWeight = 120;
    private static int minHeight = 150;
    private static int maxHeight = 190;

    private static Person[] randomPersonsArray = new Person[100];

    private final static String[] NAMES_ARRAY = {
            "Jack", "Mike", "Olga", "Jenny", "Ruth", "Billy", "Jimmy", "Ronda", "Jil", "Megan",
            "Dolly", "Sergey", "Anita", "Delorian", "Rocky", "Sigourney", "Bob", "Alex", "Rob", "Nickie",
            "Liam", "Olivia", "Noah", "Emma", "Oliver", "Charlotte", "Elijah", "Ava", "Mia", "Henry"
    };

    private final static String[] SECOND_NAMES_ARRAY = {
            "Smith", "Johnson", "Williams", "Brown", "Jones", "Garcia", "Miller", "Davis", "Rodriguez", "Martinez",
            "Hernandez", "Lopez", "Gonzalez", "Wilson", "Anderson", "Thomas", "Taylor", "Lee", "White", "Clark",
            "Perez", "Harris", "Lewis", "Young", "Allen", "King", "Scott", "Hill", "Hall", "Carter"
    };

    public PersonGenerator() {
        fillPersonsArray();
    }

    private static void fillPersonsArray() {
        for (int i = 0; i < randomPersonsArray.length; i++) {
            randomPersonsArray[i] = new Person(
                    getRandomValueFromArray(NAMES_ARRAY),
                    getRandomValueFromArray(SECOND_NAMES_ARRAY),
                    getRandomNumber(minAge, maxAge),
                    getRandomNumber(minWeight, maxWeight),
                    getRandomNumber(minHeight, maxHeight)
            );
        }
    }

    private static String getRandomValueFromArray(String[] array) {
        int rnd = new Random().nextInt(array.length);
        return array[rnd];
    }

    private static int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public Person[] getRandomPersonsArray() {
        return randomPersonsArray;
    }

}
