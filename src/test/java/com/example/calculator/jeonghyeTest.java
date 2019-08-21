package com.example.calculator;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class jeonghyeTest {

    @Test
    public void test_뺄셈(){
        Calculator calc = new Calculator();
        int result = calc.substract(12, 4);

        assertEquals("8이 나와야 합니다!!", 8, result);
    }
}
