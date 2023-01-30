package com.javabasic.lesson14oop.estate;

public class ResidentialRealEstate extends RealEstate {

    double subsidyPercentage;

    public ResidentialRealEstate(int realEstateArea, int realEstateAreaMeterTax, double subsidyPercentage) {
        super(realEstateArea, realEstateAreaMeterTax);
        this.subsidyPercentage = subsidyPercentage;

    }

    @Override
    public double getRealEstateTax() {
        double tax = super.getRealEstateTax();
        return tax - super.getTaxFromPercentage(tax, subsidyPercentage);
    }

}
