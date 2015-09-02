package com.tw.calculator;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

public class ConsoleTest {

    @Test
    public void shouldReadAnyInputFromTheUser() {
        String input = "add 5";
        Console test = mock(Console.class);
        when(test.getInputFromUser()).thenReturn(input);
        assertEquals(input, test.getInputFromUser());
    }



    @Test
    public void shouldDisplayAnyResultToTheConsole() {
        Console testConsole = mock(Console.class);
        Double outputValue = 1.0;
        testConsole.displayOutput(outputValue);
        Mockito.verify(testConsole, times(1)).displayOutput(outputValue);
    }
}
