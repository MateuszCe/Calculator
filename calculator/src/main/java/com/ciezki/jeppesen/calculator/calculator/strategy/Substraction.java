package com.ciezki.jeppesen.calculator.calculator.strategy;

import com.ciezki.jeppesen.calculator.calculator.strategy.Calculations;

public class Substraction implements Calculations {

    public double result(double numberA, double numberB) {

        if (numberA<0 || numberB<0){
            throw new IllegalArgumentException("Kalkuator nie przyjmuje ujemnych wartosci");
        }
        return numberA - numberB;
    }
}
