package Lecture_10;
import java.util.Scanner;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        int result = ReverseNumber(num);
        System.out.println("The reverse number is: " + result);
    }
     public static int ReverseNumber(int num) {
        int result = 0;
        boolean flag = true;
         while (num != 0) {
             int unit_digit = num % 10;
             num = num / 10;
             result = result*10 + unit_digit ;
         }
        return result;
     }
}