package com.ciezki.jeppesen.calculator.calculator;

import com.ciezki.jeppesen.calculator.calculator.calculator.*;
import org.junit.*;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public class CalculatorTest {

    private Calculator calculator;


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

    @Test
    public void shouldDivideTwoPositiveNumbers() {
        Division division = new Division();
        double result = division.compute(2.5, 10.5);
        assertEquals(0.2380, result, 0.0001);
    }

    @Test
    public void shouldDividePositiveAndNegativeNumbers() {
        Division division = new Division();
        double result = division.compute(-2.5,10.5);
        assertEquals(-0.2380,result,0.0001);
    }
    @Test
    public void shouldDividetwoNegativeNumbers(){
        Division division = new Division();
        double result = division.compute(-2.5,-10.5);
        assertEquals(0.2380,result,0.0001);
    }




}
