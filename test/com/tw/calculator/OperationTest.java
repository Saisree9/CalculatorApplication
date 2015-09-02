package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class OperationTest {
    @Test
    public void shouldCallComputeResultFunction() {
        Operation test = mock(Operation.class);
        when(test.computeResult(0)).thenReturn(0.0);
        assertEquals(0, test.computeResult(0), 0);
    }


}