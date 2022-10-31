package com.javabasic.lesson3;

public class SecretFormula {

    public static void main(String[] args) {

        float a = 3.5F;
        float b = 4.2F;
        float c = 5.457F;
        int pow = 3;

        double result = Math.abs(a - b) / Math.pow((a + b), pow) - Math.sqrt(c);
        System.out.println(result);

    }
}
