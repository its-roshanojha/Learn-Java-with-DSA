package Lecture_11;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        int originalNum = Math.abs(num); // handle negative numbers

        int count = 0;

        // Method 1: Count using loop
        if (originalNum == 0) {
            count = 1;
        } else {
            int temp = originalNum;
            while (temp != 0) {
                temp = temp / 10;
                count++;
            }
        }

        System.out.println("Count of digits (Method 1): " + count);

        // Method 2: Count using log
        int count2 = countDigitsViaLog(originalNum);
        System.out.println("Count of digits (Method 2): " + count2);
    }

    public static int countDigitsViaLog(int num) {
        if (num == 0) {
            return 1;
        }

        // Use log base 10 to count digits
        return (int)(Math.log10(num)) + 1;
    }
}
