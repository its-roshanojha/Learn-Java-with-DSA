package Lecture_6.src;

import java.util.Scanner;

public class MyTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = sc.nextLine();
        System.out.println("Hi my name is " + name);
        sc.close();
    }
    
}
