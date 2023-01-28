package com.javabasic.lesson14oop;

public class ResidentialRealEstateTax extends RealEstateTax {

    double subsidyPercentage;

    public ResidentialRealEstateTax(int realEstateArea, int realEstateAreaMeterTax, double subsidyPercentage) {
        super(realEstateArea, realEstateAreaMeterTax);
        this.subsidyPercentage = subsidyPercentage;

    }

    @Override
    public double getRealEstateTax() {
        double tax = super.getRealEstateTax();
        return tax - super.getTaxFromPercentage(tax, subsidyPercentage);
    }

}
