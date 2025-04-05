package Lecture_9;

import Lecture_9.operations.*;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Calculator obj = new Calculator();
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to Smart Calculator - Powered by Java + Packages");

        do {
            System.out.println("Choose an Operation: (*, +, -, %, /)");
            System.out.print("-> ");
            String input = sc.next();
            char ch = input.charAt(0);

            char[] validOperations = {'*', '+', '-', '%', '/'};

            if (input.length() != 1 || !isValidOperation(input.charAt(0), validOperations)) {
                System.out.println("Invalid input, please try again.");
                System.out.println("Kya kar raha h badwe!");
            } else {
                obj.chooseOperation(input.charAt(0));
            }

            boolean exit = obj.exitProgram();
            if (exit) {
                break;
            }

        } while (true);

        System.out.println("Thanks for using the Smart Calculator!");
    }

    public static boolean isValidOperation(char ch, char[] validOps) {
        for (char op : validOps) {
            if (ch == op) {
                return true;
            }
        }
        System.out.println("Kya kar raha h badwe!");
        return false;
    }

    public boolean exitProgram() {
        Scanner sc = new Scanner(System.in);
        int retries = 5;
        for (int i = 0; i < retries; i++) {
            System.out.print("Do you want to continue? (y/n): ");
            String input = sc.next();
            if (input.length() == 1) {
                char ch = input.charAt(0);
                if (ch == 'n' || ch == 'N') return true;
                if (ch == 'y' || ch == 'Y') return false;
            }
            System.out.println("Invalid input, please try again.");
        }

        System.out.println("Too many invalid attempts. Exiting...");
        return true;
    }

    public int getInteger(String prompt) {
        Scanner sc = new Scanner(System.in);
        System.out.print(prompt);
        return sc.nextInt();
    }

    public void chooseOperation(char ch) {
        int a, b;
        
        a = getInteger("Enter first number: ");
        b = getInteger("Enter second number: ");
        
        switch (ch) {
            case '+':
                System.out.println("Result: " + Addition.addition(a, b));
                break;

            case '-':
                System.out.println("Result: " + Subtraction.subtraction(a, b));
                break;

            case '*':
                System.out.println("Result: " + Multiplication.multiplication(a, b));
                break;

            case '/':
                try {
                    System.out.println("Result: " + Division.division(a, b));
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero!");
                }
                break;

            case '%':
                try {
                    System.out.println("Result: " + Modulo.mod(a, b));
                } catch (ArithmeticException e) {
                    System.out.println("Cannot modulo by zero!");
                }
                break;

            default:
                System.out.println("Kya kar raha h badwe!");
        }
    }
}
