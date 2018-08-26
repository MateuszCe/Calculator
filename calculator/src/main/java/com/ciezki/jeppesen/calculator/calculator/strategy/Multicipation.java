package com.ciezki.jeppesen.calculator.calculator.strategy;

public class Multicipation {

    public double result(double numberA, double numberB) {

        if (numberA == 0 || numberB == 0){
            throw new ArithmeticException("Nie mozna mnozyc przez 0");
        }
        return numberA * numberB;
    }
}
