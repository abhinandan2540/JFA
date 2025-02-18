package Chapter_11.questions;


interface bodyHair{
    void hair();
}

class Monkey implements bodyHair{
    public void jump(){
        System.out.println("jumping ability");
    }
    public void bite(){
        System.out.println("biting ability");
    }

    @Override
    public void hair() {
        System.out.println("hair is present");
    }
}

class Human extends Monkey{
    @Override
    public void jump() {
        super.jump();
    }

    @Override
    public void bite() {
        super.bite();
    }
    public void eat(){
        System.out.println("proper eating ability");
    }
    public void sleep(){
        System.out.println("proper sleeping schedule");
    }


}
public class Question_3 {
    public static void main(String[] args) {

//        Q3
//        Human hm=new Human();
//        hm.eat();
//        hm.bite();
//        hm.jump();
//        hm.sleep();

//        Q4 example has been covered enough

//        Q5
        Human hm=new Human();
        hm.hair();

    }
}
