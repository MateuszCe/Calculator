package com.ciezki.jeppesen.calculator.calculator;

import com.ciezki.jeppesen.calculator.calculator.calculator.Substraction;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SubstractionTest {


    @Test
    public void shouldSubstractTwoPostiveNumbers() {
        Substraction substraction = new Substraction();
        double result = substraction.compute(10.3, 0.5);
        assertEquals(9.8, result, 0.0001);
    }

    @Test
    public void shouldSubstractPositiveAndNegativeNumbers() {
        Substraction substraction = new Substraction();
        double result = substraction.compute(5.5, -5.5);
        assertEquals(11, result, 0.0001);
    }

    @Test
    public void shouldSubstractTwoNegativeNumbers() {
        Substraction substraction = new Substraction();
        double result = substraction.compute(-5.5, -5.5);
        assertEquals(0, result, 0.0001);
    }

}
