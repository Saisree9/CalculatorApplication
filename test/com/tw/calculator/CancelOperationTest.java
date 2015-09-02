package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CancelOperationTest {
    @Test
    public void shouldResetTheAccumulatorValueToZero() {
        assertEquals(0, new CancelOperation().computeResult(9), 0);
    }
}