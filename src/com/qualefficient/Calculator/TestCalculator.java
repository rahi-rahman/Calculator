package com.qualefficient.Calculator;

import org.junit.Test;

import static org.junit.Assert.*;


public class TestCalculator {
    @Test
    public void testCalculatorAdd2And3()
    {
        Calculator calc = new Calculator();
        assertEquals(5, calc.Add(2,3));
    }

    @Test
     public void testCalculatorSubtract2And3()
    {
        Calculator calc = new Calculator();
        assertEquals(-1, calc.Subtract(2,3));
    }

    @Test
    public void testCalculatorSubtract6And2()
    {
        Calculator calc = new Calculator();
        assertEquals(3, calc.Subtract(6,2));
    }

    @Test
    public void testCalculatorAdd0And3()
    {
        Calculator calc = new Calculator();
        assertEquals(3, calc.Add(0,3));
    }
}