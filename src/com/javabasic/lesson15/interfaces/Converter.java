package com.javabasic.lesson15.interfaces;

public interface Converter {

    default double convert(double degree) {
        return degree;
    }

}
