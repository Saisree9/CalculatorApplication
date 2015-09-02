package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class InvalidOperationTest {
    @Test
    public void shouldReturnValueFromComputeResult() {
        assertEquals(9, new InvalidOperation().computeResult(9), 0);
    }
}