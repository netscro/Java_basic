package com.javabasic.lesson15.temperaturetypes;

import com.javabasic.lesson15.interfaces.Converter;

public class Fahrenheit implements Converter {

    @Override
    public void convert(double degree) {
        double fahrenheit = ((degree / (9 / 5.0)) + 32);
        System.out.printf("Degrees in Fahrenheit: %s\n", fahrenheit);
    }
}
