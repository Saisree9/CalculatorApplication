package com.tw.calculator;

public class CalculatorApplication {
    public void run() {
        Console console = new Console();
        Interpreter interpreter = new Interpreter();
        String input;
        double accumulatedResult = 0;

        while(true) {
            accumulatedResult = getInputFromUserAndDoProcessingToDisplayResult(console, interpreter, accumulatedResult);
        }
    }

    private double getInputFromUserAndDoProcessingToDisplayResult(Console console, Interpreter interpreter, double accumulatedResult) {
        String input;
        input = console.getInputFromUser();
        if (!input.equals("exit")) {
            Operation operation = interpreter.parseToGetOperation(input);
            accumulatedResult = operation.computeResult(accumulatedResult);

            console.displayOutput(accumulatedResult);
        } else {
            stop();
        }
        return accumulatedResult;
    }

    public void stop() {
        System.exit(0);
    }
}
