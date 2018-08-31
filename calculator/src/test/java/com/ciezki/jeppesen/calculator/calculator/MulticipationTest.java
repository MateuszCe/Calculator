package com.ciezki.jeppesen.calculator.calculator;

import com.ciezki.jeppesen.calculator.calculator.calculator.Multicipation;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MulticipationTest {

    @Test
    public void shouldMultiplyTwoPositiveNumbers() {
        Multicipation multicipation = new Multicipation();
        double result = multicipation.compute(5.5, 5.5);
        assertEquals(30.25, result, 0.0001);
    }

    @Test
    public void shouldMultiplyPositiveAndNegativeNumber() {
        Multicipation multicipation = new Multicipation();
        double result = multicipation.compute(-5.5, 5.5);
        assertEquals(-30.25, result, 0.0001);
    }

    @Test
    public void shouldMultiplytwoNegativeNumbers() {
        Multicipation multicipation = new Multicipation();
        double result = multicipation.compute(-5.5, -5.5);
        assertEquals(30.25, result, 0.0001);
    }


}
