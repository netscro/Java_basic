package com.javabasic.lesson14oop.estate;

public class CommercialRealEstate extends RealEstate {

    double revenue;
    private static final double MAX_REVENUE_BEFORE_TAX = 100;
    private static final double revenueTaxPercentage = 5;

    public CommercialRealEstate(int realEstateArea, int realEstateAreaMeterTax, double revenue) {
        super(realEstateArea, realEstateAreaMeterTax);
        this.revenue = revenue;
    }

    @Override
    public double getRealEstateTax() {
        double tax = super.getRealEstateTax();

        if (revenue > MAX_REVENUE_BEFORE_TAX) {
            return tax + super.getTaxFromPercentage(tax, revenueTaxPercentage);
        }

        return tax;
    }

}
