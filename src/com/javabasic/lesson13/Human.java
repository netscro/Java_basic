package com.javabasic.lesson13;

public class Human {

    private String name;
    private String secondName;
    private int age;
    private int weight;
    private int height;
    private Person mother;
    private Person father;


    public Human(String name, String secondName, int age, int weight, int height, Person mother, Person father) {
        this.name = name;
        this.secondName = secondName;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.mother = mother;
        this.father = father;

    }

    @Override
    public String toString() {
        return "Human {name=" + name + ", secondName=" + secondName + ", " + "age=" + age + ", " +
                "weight=" + weight + ", height=" + height + ", mother=" + mother + ", father=" + father + "}";
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

    public Person getMother() {
        return this.mother;
    }

    public Person getFather() {
        return this.father;
    }

}
