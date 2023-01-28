package com.javabasic.lesson14oop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeWorkProcessor {

    public static void main(String[] args) throws InterruptedException, IOException {

        // Task №1
        List<RealEstateTax> taxes = new ArrayList<>();

        RealEstateTax residentialRealEstateTax = new ResidentialRealEstateTax(
                28, 73, 23
        );
        RealEstateTax commercialRealEstateTax = new CommercialRealEstateTax(
                21, 55, 120
        );
        RealEstateTax industrialRealEstateTax = new IndustrialRealEstateTax(
                13, 12
        );

        taxes.add(residentialRealEstateTax);
        taxes.add(commercialRealEstateTax);
        taxes.add(industrialRealEstateTax);

        for (RealEstateTax tax : taxes) {
            System.out.println("Tax for " + tax.getClass().getSimpleName() + ": " + tax.getRealEstateTax());
        }


        // Task №2
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        coffeeMachine.start();

    }

}
