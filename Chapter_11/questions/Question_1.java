package Chapter_11.questions;

abstract class pen{
    abstract public void write();
    abstract public void refill();
}

class fountainPain extends pen{
    @Override
    public void write() {
        System.out.println("write using pen...");
    }

    @Override
    public void refill() {
        System.out.println("pen refill...");
    }

    public void changeNib(){
        System.out.println("changing Nib...");
    }

}
class write extends pen{
    @Override
    public void write() {
        System.out.println("write using pen...");
    }

    @Override
    public void refill() {
        System.out.println("pen refill...");
    }
}

public class Question_1 {
    public static void main(String[] args) {

//        Q1
        write wrt=new write();
        wrt.write();
        wrt.refill();

//        Q2
        fountainPain ft=new fountainPain();
        ft.write();
        ft.refill();
        ft.changeNib();


    }
}
