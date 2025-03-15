public class Helloworld {
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