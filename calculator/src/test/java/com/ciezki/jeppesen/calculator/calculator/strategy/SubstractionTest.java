package com.ciezki.jeppesen.calculator.calculator.strategy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SubstractionTest {

    private Calculator calculator;
    @Test
    public void ifNumberIsNull() {
        Calculator calculator = new Calculator(5,5);
        Assert.assertNull(calculator);
    }
}
