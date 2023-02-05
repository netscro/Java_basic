package com.javabasic.lesson15.temperaturetypes;

import com.javabasic.lesson15.interfaces.Converter;

public class Kelvin implements Converter {

    @Override
    public void convert(double degree) {
        double kelvin = degree + 273.15;
        System.out.printf("Degrees in Kelvin: %s\n", kelvin);
    }

}
