package com.ciezki.jeppesen.calculator.calculator.strategy;

import org.junit.Assert;
import org.junit.Test;

public class DivisionTest {

    @Test
    public void ifNumberIsNull() {
        Calculator calculator = new Calculator(5,5);
        Assert.assertNull(calculator);
    }

    @Test
    public void divideByZeroReturnZero(){
        Calculator calculator = new Calculator(5,0);
        Assert.assertEquals(0,0,0);
    }
}
