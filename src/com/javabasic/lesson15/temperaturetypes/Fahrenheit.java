package com.javabasic.lesson15.temperaturetypes;

import com.javabasic.lesson15.interfaces.Converter;

public class Fahrenheit implements Converter {

    @Override
    public double convert(double degree) {
        return ((degree / (9 / 5.0)) + 32);
    }
}
