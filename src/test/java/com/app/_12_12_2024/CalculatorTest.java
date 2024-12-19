package com.app._12_12_2024;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    private static final int A = 10;
    private static final int B = 5;
    private static final int ZERO = 0;
    private static final Calculator CALCULATOR = new Calculator();

    @Test
    void dividePositiveTest() {
        Assertions.assertEquals(2, CALCULATOR.divide(A, B));
    }

    @Test
    void divideWithExceptionTest() {
        Assertions.assertThrows(DivideByZeroException.class, () -> CALCULATOR.divide(A, ZERO));
    }
}