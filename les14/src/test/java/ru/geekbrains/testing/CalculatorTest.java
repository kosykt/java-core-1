package ru.geekbrains.testing;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private Calculator calculator;
    private int[] a = {1, 2, 3, 4};
    private int[] b = {5, 6};

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @Test
    public void testAdd(){
        assertEquals(4, calculator.add(2, 2));
    }

}