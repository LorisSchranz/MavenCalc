package ch.bbw;

import java.util.Scanner;

/**
 * Hello world!
 */
public class CalculatorApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        boolean loop = true;

        while (loop) {
            String yesOrNo = "y";
            System.out.println("Console Calculator");
            System.out.println("------------------");
            System.out.println();
            System.out.println("What operator do you wanna use? (+, -, *, /)");

            String operator = scanner.next();

            String valueA;
            String valueB;

            int value1 = 0;
            int value2 = 0;

            switch (operator) {
                case "+":
                    System.out.println("what values should I add together?");
                    System.out.println("Type in your 1. number.");
                    valueA = scanner.next();
                    try {
                        value1 = Integer.parseInt(valueA);
                    } catch (Exception e) {
                        System.out.println("Your number is wrong.");
                        System.exit(0);
                    }
                    System.out.println("Type in your 2. number.");
                    valueB = scanner.next();
                    try {
                        value2 = Integer.parseInt(valueB);
                    } catch (Exception e) {
                        System.out.println("Your number is wrong.");
                        System.exit(0);
                    }
                    try {
                        System.out.println("Summe " + value1 + " + " + value2 + " = " + calculator.sum(value1, value2));
                    } catch (Exception e) {
                        System.out.println("Invalid");
                        System.exit(0);
                    }
                    break;

                case "-":
                    System.out.println("what values should be subtracted?");
                    System.out.println("Type in your 1. number.");
                    valueA = scanner.next();
                    try {
                        value1 = Integer.parseInt(valueA);
                    } catch (Exception e) {
                        System.out.println("Your number is wrong.");
                        System.exit(0);
                    }
                    System.out.println("Type in your 2. number.");
                    valueB = scanner.next();
                    try {
                        value2 = Integer.parseInt(valueB);
                    } catch (Exception e) {
                        System.out.println("Your number is wrong.");
                        System.exit(0);
                    }
                    try {
                        System.out.println("Subtraction " + value1 + " - " + value2 + " = " + calculator.subtraction(value1, value2));
                    } catch (Exception e) {
                        System.out.println("Invalid");
                        System.exit(0);
                    }
                    break;

                case "*":
                    System.out.println("what values should be multiplied?");
                    System.out.println("Type in your 1. number.");
                    valueA = scanner.next();
                    try {
                        value1 = Integer.parseInt(valueA);
                    } catch (Exception e) {
                        System.out.println("Your number is wrong.");
                        System.exit(0);
                    }
                    System.out.println("Type in your 2. number.");
                    valueB = scanner.next();
                    try {
                        value2 = Integer.parseInt(valueB);
                    } catch (Exception e) {
                        System.out.println("Your number is wrong.");
                        System.exit(0);
                    }
                    try {
                        System.out.println("Multiplication " + value1 + " * " + value2 + " = " + calculator.multiplication(value1, value2));
                    } catch (Exception e) {
                        System.out.println("Invalid");
                        System.exit(0);
                    }
                    break;

                case "/":
                    System.out.println("what values should be divided?");
                    System.out.println("Type in your 1. number.");
                    valueA = scanner.next();
                    try {
                        value1 = Integer.parseInt(valueA);
                    } catch (Exception e) {
                        System.out.println("Your number is wrong.");
                        System.exit(0);
                    }
                    System.out.println("Type in your 2. number.");
                    valueB = scanner.next();
                    try {
                        value2 = Integer.parseInt(valueB);
                    } catch (Exception e) {
                        System.out.println("Your number is wrong.");
                        System.exit(0);
                    }
                    try {
                        System.out.println("Division " + value1 + " / " + value2 + " = " + calculator.division(value1, value2));
                    } catch (Exception e) {
                        System.out.println("Invalid");
                        System.exit(0);
                    }
                    break;

                default:
                    System.out.println("Your operator is wrong");
                    System.exit(0);
            }
            System.out.println("Do you wanna exit? (y/n)");
            yesOrNo = scanner.next();
            if (yesOrNo.equals("y")) {
                loop = false;
            } else if (yesOrNo.equals("n")) {
                loop = true;
            } else {
                System.out.println("Not allowed operation.");
                System.exit(0);
            }
        }
        System.out.println("wish you a nice day :D");
    }
}
