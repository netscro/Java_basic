package com.javabasic.lesson3;

import java.text.DecimalFormat;

public class SnowmanWeight {

    public static void main(String[] args) {

        DecimalFormat decimalFormat = new DecimalFormat( "#.###" );

        float ballDensity = 0.7F;

        int firstBallRadius = 1;
        float secondBallRadius = 0.5F;
        float thirdBallRadius = 0.2F;

        double firstSnowballWeight = objectWeight(ballDensity, objectVolume(firstBallRadius));
        double secondSnowballWeight = objectWeight(ballDensity, objectVolume(secondBallRadius));
        double thirdSnowballWeight = objectWeight(ballDensity, objectVolume(thirdBallRadius));

        double result = firstSnowballWeight + secondSnowballWeight + thirdSnowballWeight;

        System.out.printf("The snowman weight is: %s", decimalFormat.format(result));
    }

    public static double objectVolume(double radius){
        return (double) 4 / 3 * Math.PI * Math.pow(radius, 3);
    }

    public static double objectWeight(double density, double volume){
        return volume * density;
    }
}
