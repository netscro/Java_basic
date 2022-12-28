package com.javabasic.lesson11;

public class Cat {

    String breed;
    String name;
    int age;
    int weight;

    public Cat() {
        System.out.println("Hello kitty! Welcome to this world :)");
    }

    public Cat(String breed, String name, int age, int weight) {
        this.breed = breed;
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Cat {breed='" + breed + '\'' + ", name='" + name + '\'' + ", age=" + age + ", weight=" + weight + '}';
    }

    public boolean equals(Object obj) {
        if (obj instanceof Cat) {
            Cat cat = (Cat) obj;
            return this.age == cat.age && this.weight == cat.weight;
        }
        return false;
    }

}