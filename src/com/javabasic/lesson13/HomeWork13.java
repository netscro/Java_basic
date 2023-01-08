package com.javabasic.lesson13;

public class HomeWork13 {

    public static void main(String[] args) {
        // task 1
        PersonGenerator persons = new PersonGenerator();
        Person[] personsArray = persons.getRandomPersonsArray();
        System.out.println(personsArray[0]);
        System.out.println(personsArray[1]);
        System.out.println(personsArray[2]);

        // task 2
        Person superMansMother = new Person("Antonina", "Smith", 57, 68, 170);
        Person superMansFather = new Person("Petro", "Frost", 62, 90, 180);
        Human superMan = new Human(
                "Alex", "Frost", 35, 83, 187,
                superMansMother, superMansFather
        );
        System.out.println(superMan);
        System.out.println(superMansMother);
        System.out.println(superMansFather);

    }

}
