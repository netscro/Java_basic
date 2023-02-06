package com.javabasic.lesson15.temperaturetypes;

import com.javabasic.lesson15.interfaces.Converter;

public class Kelvin implements Converter {

    @Override
    public double convert(double degree) {
        return degree + 273.15;
    }

}
