package Lecture_10;
import java.util.Scanner;
import java.math.*;

public class Prime {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        if (isPrime(num)){
            System.out.println(num + " is a prime number");
        }else {
            System.out.println(num + " is not a prime number");
        }
        scan.close();
    }

    public static boolean isPrime(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num)+1; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}