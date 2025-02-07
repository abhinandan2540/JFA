package Chapter_07;

public class Method_Overloading {
    static void foo(){
        System.out.println("good morning");
    }
    static void foo(int x){
        System.out.println("good morning "+x+" times");
    }
    static void foo(int x, int y){
        System.out.println("good morning "+x+" times "+y+" times");
    }
    static void foo(int x, int y, int z){
        System.out.println("good morning "+x+" times "+y+" times "+z+" times");
    }
    public static void main(String[] args) {
        foo();
        foo(10);
        foo(10,20);
        foo(10,20,30);

    }
}
