package com.ciezki.jeppesen.calculator.calculator.strategy;

public class Additional implements Calculations {

    public double result(double numberA, double numberB) {

        if (numberA <0 || numberB < 0){
            throw new IllegalArgumentException("Kalkulator nie przyjmuje ujemnych wartoci");
        }
        return numberA + numberB;
    }

}
