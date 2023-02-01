package com.javabasic.lesson14oop.coffemachine;

public class HotDrink {

    private final double price;
    String drinkName;

    public HotDrink(String drinkName, double price) {
        this.drinkName = drinkName;
        this.price = price;
    }

    public void makeDrink() throws InterruptedException {
        System.out.printf("The making of [%s] has been started. Please wait...\n", drinkName);
    }

    public double getPrice() {
        return price;
    }

}
