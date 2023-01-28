package com.javabasic.lesson14oop;

public class CommercialRealEstateTax extends RealEstateTax {

    double revenue;
    private static final double maxRevenueBeforeTax = 100;
    private static final double revenueTaxPercentage = 5;

    public CommercialRealEstateTax(int realEstateArea, int realEstateAreaMeterTax, double revenue) {
        super(realEstateArea, realEstateAreaMeterTax);
        this.revenue = revenue;
    }

    @Override
    public double getRealEstateTax() {
        double tax = super.getRealEstateTax();

        if (revenue > maxRevenueBeforeTax) {
            return tax + super.getTaxFromPercentage(tax, revenueTaxPercentage);
        }

        return tax;
    }

}
