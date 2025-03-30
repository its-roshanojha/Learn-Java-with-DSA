package Lecture_6.src;

import java.util.Scanner;

public class MyTemp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = sc.nextLine();
        System.out.println("Hi my name is " + name);

        System.out.println("what is your age ?");
        String age = sc.next();
        // Wrapper class in java 
        Integer final_age = Integer.parseInt(age);

        Integer final_age_2 = Integer.valueOf(final_age);
        final_age_2.toString(0); 

        System.out.println(name + " is "+ final_age + " years old");


        sc.close();
    }
    
}
