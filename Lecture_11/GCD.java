package Lecture_11;
public class GCD {
    public static int gcd(int num1, int num2) {
        int min = Math.min(num1, num2);
        while (min > 0) {
            if (num1 % min == 0 && num2 % min == 0) {
                System.out.println("GCD is: " + min);
                break;
            }
            min--;
        }
        return min;
    }
}