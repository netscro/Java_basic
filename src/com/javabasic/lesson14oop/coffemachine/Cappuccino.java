package com.javabasic.lesson14oop.coffemachine;

import java.util.concurrent.TimeUnit;

public class Cappuccino extends HotDrink {

    public Cappuccino(String drinkName, double price) {
        super(drinkName, price);
    }

    @Override
    public void makeDrink() throws InterruptedException {
        super.makeDrink();
        TimeUnit.SECONDS.sleep(7);
    }
}