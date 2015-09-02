package com.tw.calculator;

public class SubtractionOperation implements Operation{
    private int operand;

    public SubtractionOperation(int operand) {
        this.operand = operand;
    }

    public double computeResult(double accumulator) {
        accumulator -= operand;
        return accumulator;
    }

    @Override
    public boolean equals(Object that) {
        if (!(that.getClass() == getClass()))
            return false;
        SubtractionOperation thatSubtractionOperation = (SubtractionOperation) that;
        return thatSubtractionOperation.operand == operand;
    }
}
