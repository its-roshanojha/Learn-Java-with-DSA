package Lecture_11;
import java.util.Scanner;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = scan.nextInt();
        boolean result = findArmstrong(num);
        if (result) {
            System.out.println("This is a Armstrong number: " + num);
        } else {
            System.out.println("This is not a Armstrong number: " + num);
        }
    }

    public static boolean findArmstrong(int num) {
        int sum = 0;
        int temp = num;
        while (num != 0) {
            int unitdigit = num % 10;
            num = num / 10;
            sum += Math.pow(unitdigit, 3);
        }
        if (sum == temp) {
            return true;
        }
        return false;
    }
}