package com.tw.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class InterpreterTest {
    @Test
    public void shouldParseAddCommandWhichCallsAdditionOperationConstructor() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("add 5");

        assertEquals(new AdditionOperation(5), operation);
    }

    @Test
    public void shouldParseSubtractCommandWhichCallsSubtractionOperationConstructor() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("subtract 5");

        assertEquals(new SubtractionOperation(5), operation);
    }

    @Test
    public void shouldParseMultiplyCommandWhichCallsMultiplicationOperationConstructor() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("multiply 5");

        assertEquals(new MultiplicationOperation(5), operation);
    }

    @Test
    public void shouldParseDivisionCommandWhichCallsDivisionOperationConstructor() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("divide 5");

        assertEquals(new DivisionOperation(5), operation);
    }

    @Test
    public void shouldParseCancelCommandWhichReturnsCancelOperationObject() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("cancel");

        assertEquals(CancelOperation.class, operation.getClass());
    }

    @Test
    public void shouldReturnInvalidOperationWhenInvalidCommandIsGiven() {
        Interpreter interpreter = new Interpreter();
        Operation operation = interpreter.parseToGetOperation("hjsjhas");


    }
}