package com.javabasic.lesson11;

public class HomeWork11 {
    public static void main(String[] args) {
        // task №1
        Cat cat1 = new Cat("street", "Barsik", 5, 9);
        Cat cat2 = new Cat("Bob", 3);
        Cat cat3 = new Cat("Sphinx", "Susan", 5, 9);
        Cat cat4 = new Cat();
        System.out.println(cat3.equals(cat1));
        System.out.println(cat1.equals(cat2));
        System.out.println(cat4.equals(cat3));
        System.out.println(cat1);

        // task №2
        PasswordGenerator password = new PasswordGenerator(8);
        System.out.println(password.getPassword());
    }
}
