package com.javabasic.lesson14oop;

public class RealEstateTax {

    int realEstateArea;
    int realEstateAreaMeterTax;

    public RealEstateTax(int realEstateArea, int realEstateAreaMeterTax) {
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
