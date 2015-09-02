package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplicationOperationTest {
    @Test
    public void shouldReturnValueFromComputeResult() {
        assertEquals(0, new MultiplicationOperation(0).computeResult(0), 0);
    }

    @Test
    public void shouldPerformMultiplicationUsingPreInitiatedValueAndOperand() {
        assertEquals(10, new MultiplicationOperation(5).computeResult(2), 0);
    }
}