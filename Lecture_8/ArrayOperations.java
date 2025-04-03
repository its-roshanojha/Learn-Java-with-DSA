package Lecture_8;

import java.util.Scanner;

public class ArrayOperations {
    public static void main(String[] args) {
        System.out.print("Enter the size of the array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        insertValues(arr, sc);
        printArray(arr);

        sc.close();
    }    

    public static void insertValues (int[] arr, Scanner sc) {
        System.out.println("Enter array of "+arr.length+" Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
    }

    public static void printArray(int[] arr) {

        System.out.println(arr);
        System.out.println("The entered elements are : ");

        for(int num : arr) {
            System.out.print(num+ " ");
        }

        System.out.println("");
    }


}
