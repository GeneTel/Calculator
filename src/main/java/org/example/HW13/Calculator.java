package org.example.HW13;

    public class Calculator {
        public static void main(String[] args) {
            if (args.length != 3) {
                System.out.println("Usage: java Calculator <num1> <num2> <operation>");
                return;
            }

            double num1 = Double.parseDouble(args[0]);
            double num2 = Double.parseDouble(args[1]);
            String operation = args[2];

            double result = 0;

            switch (operation) {
                case "+":
                    result = num1 + num2;
                    break;
                case "-":
                    result = num1 - num2;
                    break;
                case "x":
                    result = num1 * num2;
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero!");
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error: Invalid operation!");
                    return;
            }

            System.out.println("Result: " + result);
        }
    }




