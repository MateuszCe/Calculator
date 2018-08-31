package com.ciezki.jeppesen.calculator.calculator;

import com.ciezki.jeppesen.calculator.calculator.calculator.Addition;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionTest {


    @Test
    public void shouldAddPositiveAndNegative() {
        Addition addition = new Addition();
        double result = addition.compute(5.5, 5.5);
        assertEquals(11, result, 0.0001);
    }

    @Test
    public void shouldAddTwoNegativeNumbers() {
        Addition addition = new Addition();
        double result = addition.compute(-5.5, -5.5);
        assertEquals(-11, result, 0.0001);
    }

    @Test
    public void shouldAddNumberAndZero() {
        Addition addition = new Addition();
        double result = addition.compute(5.5, 0);
        assertEquals(5.5, result, 0.0001);
    }


}