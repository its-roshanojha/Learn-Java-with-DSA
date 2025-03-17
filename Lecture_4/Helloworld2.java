package Lecture_4;
class Helloworld {
    protected static int test(){
        System.out.println("test function call");
                return 0;
    }
    public static void main (String[] args){
        int a = test();
        System.out.println(test());
        System.out.println(a);
    }
}

class MyFirstMG {
    public static void main(String args[]){
        System.out.println("Hello Shashwat Tiwari 1");
        System.out.println(args[0]+ "sona --> GOLD");
        return;
    }
    public static void main1(String args[]){
        System.out.println("Hello Shashwat Tiwari 4");
    }
}

class MyFirstClass {
    public static void main(String args[]){
        System.out.println("Hello Shashwat Tiwari 2");
    }
}

class MySecondClass {
    public static void main(String args[]){
        System.out.println("Hello Shashwat Tiwari 3");
    }
}


