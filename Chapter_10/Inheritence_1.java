package Chapter_10;

//creating parent class (super class)
class Base{
    public int x;

    public void setX(int myx){
        System.out.println("i am setting x in parent base class");
        this.x=myx;
    }

    public int getX(){
        return x;
    }

}

//creating child class (sub class)
class Derived extends Base{
    public  int y;

    public void setY(int myy){
        System.out.println("i am setting y in derived");
        this.y=myy;
    }
    public int getY(){
        return y;
    }

}

public class Inheritence_1 {
    public static void main(String[] args) {
//        acessing inheritence
//         base class (parsent class)
        Base avx=new Base();
        avx.setX(4);
        System.out.println("X with Base: "+avx.getX());

        //       setting x in derived (sub class) (child class)
       Derived avy=new Derived();
       avy.setX(13);
        System.out.println("X with Derived: "+avy.getX());

        avy.setY(15);
        System.out.println("Y with Derived: "+avy.getY());


    }
}
