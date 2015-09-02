package com.tw.calculator;

public class MultiplicationOperation implements Operation {
    private int operand;

    public MultiplicationOperation(int operand) {
        this.operand = operand;
    }

    public double computeResult(double accumulator) {
        accumulator *= operand;
        return accumulator;
    }

    @Override
    public boolean equals(Object that) {
        if (!(that.getClass() == getClass()))
            return false;
        MultiplicationOperation thatMultiplicationOperation = (MultiplicationOperation) that;
        return thatMultiplicationOperation.operand == operand;
    }
}
