package Chapter_11;
interface Inheritence1{
    void meth1();
    void meth2();
}
interface Inheritence2 extends Inheritence1{
    void meth3();
    void meth4();
}
class ParentClass implements Inheritence2{
    @Override
    public void meth1() {
        System.out.println("method 1");
    }

    @Override
    public void meth2() {
        System.out.println("method 2");
    }

    @Override
    public void meth3() {
        System.out.println("method 3");
    }

    @Override
    public void meth4() {
        System.out.println("method 4");
    }
}

public class interfaces_inheritence {
    public static void main(String[] args) {
        ParentClass pt=new ParentClass();
        pt.meth1();
        pt.meth2();
        pt.meth3();
        pt.meth4();

    }
}
