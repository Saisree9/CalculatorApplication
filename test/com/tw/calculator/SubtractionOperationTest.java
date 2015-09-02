package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class SubtractionOperationTest {


        @Test
        public void shouldReturnValueFromComputeResult() {
            assertEquals(9, new SubtractionOperation(0).computeResult(9), 0);
        }

        @Test
        public void shouldPerformSubtractionUsingPreInitiatedValueAndOperand() {
            assertEquals(4, new SubtractionOperation(5).computeResult(9), 0);
        }
}