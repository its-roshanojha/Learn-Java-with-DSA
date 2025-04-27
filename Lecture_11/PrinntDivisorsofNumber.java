package Lecture_11;
import java.util.Scanner;
public class PrinntDivisorsofNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        int counter = 1;
        while (counter <= (int)Math.sqrt(num)){
            if (num % counter == 0) {
                System.out.println(counter + " is a divisor of " + num);
                int pairDivisor = num / counter;
                if (pairDivisor != counter) {
                    System.out.println(pairDivisor + " is a pair divisor of " + num);
                }
            }
            counter++;
        }
        scan.close();
    }
}