package Chapter_11;

import java.util.Scanner;

/*
    PLEASE REFER "abstract_2" FIRST
    EXAMPLE 1 OF 2 FOR ABSTRACT CLASS IN JAVA
 */


abstract class Animal{
    abstract public void animal_type();

    public void make_sound(){
        System.out.println("what type of sound it makes : ");
        Scanner user=new Scanner(System.in);
        System.out.println(user.next());
    }
}
class dog extends Animal{
    @Override
    public void animal_type() {
        System.out.println("animal dog");
    }

    @Override
    public void make_sound() {
        super.make_sound();
    }
}

class cat extends Animal{
    @Override
    public void animal_type() {
        System.out.println("animal cat");
    }

    @Override
    public void make_sound() {
        super.make_sound();
    }
}

class cow extends Animal{
    @Override
    public void animal_type() {
        System.out.println("animal cow");
    }

    @Override
    public void make_sound() {
        super.make_sound();
    }
}

public class abstract_1 {
    public static void main(String[] args) {
//        dog dg=new dog();
//        dg.animal_type();
//        dg.make_sound();
        cat ct=new cat();
        ct.animal_type();
        ct.make_sound();
    }
}
