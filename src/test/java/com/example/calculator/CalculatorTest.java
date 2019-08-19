package com.example.calculator;


import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class CalculatorTest {
    @Test
    public void test_양수덧셈(){
        Calculator calc = new Calculator();
        int result = calc.add(5, 4);

        assertEquals("add 함수의 결과는 9이어야 합니다.",
                9, result);
    }

    @Test
    public void test_음수덧셈(){
        Calculator calc = new Calculator();
        int result = calc.add(-5, -4);

        assertEquals("add 함수의 결과는 -9이어야 합니다.",
                -9, result);
    }

    @Test
    public void test_양수덧셈2(){
        Calculator calc = new Calculator();
        int result = calc.add(5, 4);

        assertNotEquals(0, result);
    }

    @Test
    public void test_양수양수나눗셈(){
        Calculator calc = new Calculator();
        int result = calc.div(12, 4);

        assertEquals("3이 나와야 합니다.", 3, result);
    }

    @Test
    public void test_음수양수나눗셈(){
        Calculator calc = new Calculator();
        int result = calc.div(-12, 4);

        assertEquals("-3이 나와야 합니다.", -3, result);
    }

    @Test
    public void test_양수음수나눗셈(){
        Calculator calc = new Calculator();
        int result = calc.div(12, -4);

        assertEquals("-3이 나와야 합니다.", -3, result);
    }

    @Test
    public void test_음수음수나눗셈(){
        Calculator calc = new Calculator();
        int result = calc.div(-12, -4);

        assertEquals("3이 나와야 합니다.", 3, result);
    }
}
