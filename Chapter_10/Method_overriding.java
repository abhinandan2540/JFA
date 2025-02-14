package Chapter_10;

class A{
    public void method1(){
        System.out.println("i am method of A 1");
    }
    public void method2(){
        System.out.println("i am method of A 2");
    }
}
class B extends A{
    @Override
    public void method2(){
        System.out.println("i am method of B 2");
    }

    public void method3(){
        System.out.println("i am method of B 3");
    }
    public void method4(){
        System.out.println("i am method of B 4");
    }
}

public class Method_overriding {
    public static void main(String[] args) {
        B av=new B();
        A ava=new A();

//        normal condition
//        av.method1();
//        av.method2();
//        av.method3();
//        av.method4();

//        overriding condition
        ava.method2();
        av.method2();

    }
}
