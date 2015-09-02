package com.tw.calculator;

public class DivisionOperation implements Operation {
    private int operand;

    public DivisionOperation(int operand) {
        this.operand = operand;
    }

    public double computeResult(double accumulator) {
        if (operand != 0)
            accumulator /= operand;
        return accumulator;
    }

    @Override
    public boolean equals(Object that) {
        if (!(that.getClass() == getClass()))
            return false;
        DivisionOperation thatDivisionOperation = (DivisionOperation) that;
        return thatDivisionOperation.operand == operand;
    }
}
