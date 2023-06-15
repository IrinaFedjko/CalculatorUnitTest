package org.example;

import java.util.Scanner;

public class Calculator {
    private final Scanner scanner = new Scanner(System.in);

    public void start() {

        String choice = this.getUserInput("Choose the operator: add, sub, mul, div or end to exit: ");

//
//        System.out.println("Enter the first number: ");
//        Double num1 = Double.parseDouble(this.scanner.nextLine());
//
//        System.out.println("Enter the second number: ");
//        Double num2 = Double.parseDouble(this.scanner.nextLine());

        switch (choice) {
            case "add":
                System.out.println(
                        "The answer is " +
                                this.add(
                                        Double.parseDouble(this.getUserInput("Enter the first number:")),
                                        Double.parseDouble(this.getUserInput("Enter the second number:"))
                                )
                );
                break;
            case "sub":
                System.out.println(
                        "The answer is " +
                                this.subtract(
                                        Double.parseDouble(this.getUserInput("Enter the first number:")),
                                        Double.parseDouble(this.getUserInput("Enter the second number:"))
                                )
                );
                break;
            case "div":
                System.out.println(
                        "The answer is " +
                                this.divide(
                                        Double.parseDouble(this.getUserInput("Enter the first number:")),
                                        Double.parseDouble(this.getUserInput("Enter the second number:"))
                                )
                );
                break;
            case "mul":
                System.out.println(
                        "The answer is " +
                                this.multiply(
                                        Double.parseDouble(this.getUserInput("Enter the first number:")),
                                        Double.parseDouble(this.getUserInput("Enter the second number:"))
                                )
                );
                break;
            case "end":
                System.exit(0);
                break;
            default:
                System.out.println("Invalid");
        }
        start();

    }

    public String getUserInput(String message) {
        System.out.println(message + ": ");
        return this.scanner.nextLine();
    }

    public String add(double num1, double num2) {
        double answer = num1 + num2;
        return this.formatAnswer(answer);
    }

    private String formatAnswer(double answer) {
        return String.format("%.2f", answer).replace(",", ".");
    }

    //String.format("%.2f", Math.round(answer));
    public String subtract(double num1, double num2) {
        double answer = num1 - num2;
        return this.formatAnswer(answer);
//        return String.valueOf(answer);
    }

    public String divide(double num1, double num2) {
        double answer = num1 / num2;
        return this.formatAnswer(answer);
    }

    public String multiply(double num1, double num2) {
        double answer = num1 * num2;
        return this.formatAnswer(answer);
    }
}
