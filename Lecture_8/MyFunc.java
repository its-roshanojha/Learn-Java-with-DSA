package Lecture_8;

import java.util.Scanner;

class MyFunc {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth:");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(); 
        int breadth = sc.nextInt(); 

        sc.close(); 

        MyFunc newInstance = new MyFunc();
        int area = newInstance.calculateArea(length, breadth);
        System.out.println("Our new area is: " + area);
    }

    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }
}
