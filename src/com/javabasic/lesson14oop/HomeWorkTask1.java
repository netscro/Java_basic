package com.javabasic.lesson14oop;

import com.javabasic.lesson14oop.estate.CommercialRealEstate;
import com.javabasic.lesson14oop.estate.IndustrialRealEstate;
import com.javabasic.lesson14oop.estate.RealEstate;
import com.javabasic.lesson14oop.estate.ResidentialRealEstate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class HomeWorkTask1 {

    public static void main(String[] args) throws InterruptedException, IOException {

        List<RealEstate> estates = new ArrayList<>();

        RealEstate residentialRealEstateTax = new ResidentialRealEstate(
                28, 73, 23
        );
        RealEstate commercialRealEstateTax = new CommercialRealEstate(
                21, 55, 120
        );
        RealEstate industrialRealEstateTax = new IndustrialRealEstate(
                13, 12
        );

        estates.add(residentialRealEstateTax);
        estates.add(commercialRealEstateTax);
        estates.add(industrialRealEstateTax);

        for (RealEstate tax : estates) {
            System.out.println("Tax for " + tax.getClass().getSimpleName() + ": " + tax.getRealEstateTax());
        }

    }

}
