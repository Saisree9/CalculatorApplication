package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class DivisionOperationTest {
    @Test
    public void shouldReturnValueFromComputeResult() {
        assertEquals(0, new DivisionOperation(0).computeResult(0), 0);
    }

    @Test
    public void shouldPerformDivisionUsingPreInitiatedValueAndOperand() {
        assertEquals(5, new DivisionOperation(2).computeResult(10), 0);
    }
}