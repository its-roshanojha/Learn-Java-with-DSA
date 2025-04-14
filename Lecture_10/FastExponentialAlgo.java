package Lecture_10;
import java.util.Scanner;

public class FastExponentialAlgo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of which you want to get power of:");
        int num = scan.nextInt();
        System.out.println("Enter the power:");
        int power = scan.nextInt();

        int result = findPower(num, power);
        System.out.println("The power of " + num + " raised to " + power + " is: " + result);
    }

    public static int findPower(int num, int pow) {
        int result = 1;

        while (pow > 0) {
            if (pow % 2 != 0) { // if odd
                result *= num;
            }
            num *= num; // square the base
            pow /= 2;   // divide power by 2
        }

        return result;
    }
}
