package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AdditionOperationTest {

    @Test
    public void shouldReturnValueFromComputeResult() {
        assertEquals(9, new AdditionOperation(0).computeResult(9), 0);
    }

    @Test
    public void shouldPerformAdditionUsingPreInitiatedValueAndOperand() {
        assertEquals(14, new AdditionOperation(5).computeResult(9), 0);
    }
}
