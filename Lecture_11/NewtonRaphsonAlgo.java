package Lecture_11;
import java.util.Scanner;
public class NewtonRaphsonAlgo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        double num = scan.nextDouble();
        double result = newtonRaphson(num);
        System.out.println("The root of " + num + " is: " + result);
        scan.close();
    }
    public static double newtonRaphson(double num) {
        int tolerence = 0.01;
        double root;
        double x = num;
        while (true){
            root = 0.5 * (x + num / x);
            if (Math.abs(root - x) < tolerence) {
                break;
            }
            x = root;
        }
        return root;
    }
}