package com.javabasic.lesson14oop.coffemachine;

import java.util.concurrent.TimeUnit;

public class Tea extends HotDrink {

    public Tea(String drinkName, double price) {
        super(drinkName, price);
    }

    @Override
    public void makeDrink() throws InterruptedException {
        super.makeDrink();
        TimeUnit.SECONDS.sleep(3);
    }

}
