package Lecture_10;
import java.util.Scanner;

public class MathforDSA {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number you wish to convert it to a binary number: ");
        int num = scan.nextInt();
        int bin_val = dec_to_bin(num);
        System.out.println("The binary number is: " + bin_val);

        System.out.println("Enter the number you wish to convert it to a Decimal from binary number: ");
        int num2 = scan.nextInt();
        int dec_val = bin_to_dec(num2);
        System.out.println("The Decimal number is: " + dec_val);

        System.out.println("Enter a decimal number to convert to another base:");
        int num3 = scan.nextInt();
        System.out.println("Enter the base (between 2 and 16):");
        int base = scan.nextInt();
        String base_val = dec_to_base(num3, base);
        System.out.println("Base-" + base + " value: " + base_val);

        scan.close();
    }
    public static int dec_to_bin(int num) {
        int power = 0;
        int result = 0;
        while (num > 0) {
            int rem = num % 2;
            num = num/2;
            result += rem * Math.pow(10, power);
            power++;
        }
        return result;
    }

    public static int bin_to_dec(int num) {
        int result = 0;
        int unit_digit = 0;
        int pow = 0;
        while (num > 0) {
            unit_digit = num % 10;
            result += unit_digit * Math.pow(2, pow);
            num = num/10;
            pow++;
        }
        return result;
    }

    public static String dec_to_base(int num, int base) {
        if (base < 2 || base > 16) {
            return "Invalid base. Please use base between 2 and 16.";
        }

        String digits = "0123456789ABCDEF";
        String result = "";

        while (num > 0) {
            int rem = num % base;
            result = result + digits.charAt(rem) ;
            num = num / base;
        }

        return result.equals("") ? "0" : result;
    }
}