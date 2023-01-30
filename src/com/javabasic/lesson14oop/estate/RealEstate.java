package com.javabasic.lesson14oop.estate;

public class RealEstate {

    private final int realEstateArea;
    int realEstateAreaMeterTax;

    public RealEstate(int realEstateArea, int realEstateAreaMeterTax) {
        this.realEstateArea = realEstateArea;
        this.realEstateAreaMeterTax = realEstateAreaMeterTax;
    }

    public double getRealEstateTax() {
        return realEstateArea * realEstateAreaMeterTax;
    }

    public double getTaxFromPercentage(double tax, double percentage) {
        return (tax / 100) * percentage;
    }

}
