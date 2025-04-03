package Lecture_8;
import java.util.Scanner;

class Temp {
    int myVar1 = 30;
}

public class MyFunc {
    public static void main(String[] args) {
        System.out.println("Enter the length and breadth:");
        Scanner sc = new Scanner(System.in);

        int length = sc.nextInt(); 
        int breadth = sc.nextInt(); 

        sc.close(); 

        MyFunc newObject = new MyFunc();
        int area = newObject.calculateArea(length, breadth);
        System.out.println("Our new area is: " + area);


// -------------------------------------------------------------------------------
        Temp obj1 =  new Temp();
        Temp obj2 =  new Temp();
        Temp obj3 =  new Temp();

        obj1.myVar1 = 10;
        obj2.myVar1 = 20;

        System.out.println(obj1.myVar1+","+obj2.myVar1+","+obj3.myVar1);

        MyFunc newObject2 = new MyFunc();
        newObject2.swapByReference(obj1, obj2);
        System.out.println("After call "+obj1.myVar1+","+obj2.myVar1);
    }

    public int calculateArea(int length, int breadth) {
        return length * breadth;
    }

    public void swapByReference(Temp obj1, Temp obj2){
        System.out.println("Older value "+obj1.myVar1+","+obj2.myVar1);
        int temp_var = obj1.myVar1;
        obj1.myVar1 = obj2.myVar1;
        obj2.myVar1 = temp_var;
    }
}
