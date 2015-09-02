package com.tw.calculator;

import java.util.Scanner;

public class Console {

    private String command;

    public String getInputFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public void displayOutput(Double output) {
        System.out.println(output);
    }
}
