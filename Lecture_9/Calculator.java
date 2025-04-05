package Lecture_9;

import Lecture_9.operations.*;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter any of the operators to perform your operation (*, +, -) : ");
        char operator = scan.next().charAt(0);

        System.out.println("Enter the first number: ");
        double num1 = scan.nextDouble();
        System.out.println("Enter the second number: ");
        double num2 = scan.nextDouble();

        double result = 0;
        boolean valid = true;

        switch (operator) {
            case '+':
                result = Addition.addition(num1, num2);
                break;
            case '-':
                result = Subtraction.subtraction(num1, num2);
                break;
            case '*':
                result = Multiplication.multiplication(num1, num2);
                break;
            default:
                valid = false;
                System.out.println("Invalid operator.");
        }

        if (valid) {
            System.out.println("The result is: " + result);
        }

        scan.close();
    }
}
