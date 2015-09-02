package com.tw.calculator;

public class AdditionOperation  implements Operation{
    private int operand;

    public AdditionOperation(int operand) {
        this.operand = operand;
    }

    public double computeResult(double accumulator) {
        operand += accumulator;
        return operand;
    }

    @Override
    public boolean equals(Object that) {
        if (!(that.getClass() == getClass()))
            return false;
        AdditionOperation thatAdditionOperation = (AdditionOperation) that;
        return thatAdditionOperation.operand == operand;
    }
}
