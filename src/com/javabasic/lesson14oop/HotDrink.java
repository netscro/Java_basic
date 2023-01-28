package com.javabasic.lesson14oop;

import java.util.concurrent.TimeUnit;

public class HotDrink {

    private double price;
    String drinkName;

    public HotDrink(String drinkName) {
        this.drinkName = drinkName;
    }

    public void makeDrink() throws InterruptedException {
        System.out.printf("The making of [%s] has been started. Please wait...\n", drinkName);
        TimeUnit.SECONDS.sleep(10);

    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

}
