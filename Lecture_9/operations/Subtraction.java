package Lecture_9.operations;

public class Subtraction {
    public static double subtraction(double a, double b) {
        try {
            return a - b;
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception: " + e.getMessage());
            return 0;
        }
    }
}
