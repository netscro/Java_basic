package com.javabasic.lesson13;

public class Person {

    private String name;
    private String secondName;
    private int age;
    private int weight;
    private int height;

    public Person(String name, String secondName, int age, int weight, int height) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person {name=" + name + ", secondName=" + secondName + ", " + "age=" + age + ", " +
                "weight=" + weight + ", " + "height=" + height + "}";
    }

    public String getName() {
        return this.name;
    }

    public String getSecondName() {
        return this.secondName;
    }

    public int getAge() {
        return this.age;
    }

    public int getWeight() {
        return this.weight;
    }

    public int getHeight() {
        return this.height;
    }

}
