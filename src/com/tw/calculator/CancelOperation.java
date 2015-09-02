package com.tw.calculator;

public class CancelOperation implements Operation {

    @Override
    public double computeResult(double accumulator) {
        return 0;
    }
}
