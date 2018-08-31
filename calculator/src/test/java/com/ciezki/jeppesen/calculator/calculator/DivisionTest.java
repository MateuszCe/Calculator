package com.ciezki.jeppesen.calculator.calculator;

import com.ciezki.jeppesen.calculator.calculator.calculator.Division;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DivisionTest {

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
        assertEquals(0.2380,result);
    }


}
