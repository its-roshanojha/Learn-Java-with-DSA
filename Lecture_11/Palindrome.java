package Lecture_11;
import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to check palindrome: ");
        int num = scan.nextInt();
        boolean result = checkPalindrome(num);
        if (result) {
            System.out.println(num + " is a palindrome");
        } else {
            System.out.println(num + " is not a palindrome");
        }
        scan.close();
    }
    public static boolean checkPalindrome(int num) {
        int copy = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return copy == reversed;
    }

}