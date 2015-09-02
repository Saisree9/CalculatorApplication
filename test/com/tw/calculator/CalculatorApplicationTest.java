package com.tw.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import java.io.ByteArrayInputStream;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;

public class CalculatorApplicationTest {
    @Test
    public void shouldCallTheGetInputFromUserWhenRunMethodIsCalled() {
        Console mockConsoleApplication = mock(Console.class);
        CalculatorApplication calculatorApplication = new CalculatorApplication();
        String input = "exit";
        System.setIn(new ByteArrayInputStream(input.getBytes()));

        calculatorApplication.run();

        Mockito.verify(mockConsoleApplication, times(1)).getInputFromUser();
    }
}