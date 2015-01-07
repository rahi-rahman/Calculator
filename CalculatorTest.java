package com.qualefficient.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testCalculatorAdd2And3()
    {
        Calculator calc = new Calculator();
        assertEquals(6, calc.Add(2,3));
    }
}