package Chapter_10;

class Parent{

    public Parent(){
        System.out.println("I am Parent class");
    }

    public Parent(int x){
        System.out.println("I am Parent class with X: "+x);
    }
}

class Daughter extends Parent{
    public Daughter(){
        System.out.println("I am Daughter class");
    }

    public Daughter(int x,int y){
//        assign x to parent class (int x)
        super(x);
        System.out.println("I am Daughter class with Y: "+y);
    }
}

class GrandDaughter extends Daughter{
    public GrandDaughter(){
        System.out.println("I am GrandDaughter class");
    }

    public GrandDaughter(int x, int y,int z){
//        assign x,y to upper classes
        super(x,y);
        System.out.println("I am GrandDaughter class with Z: "+z);
    }
}

public class cons_inheri {
    public static void main(String[] args) {

        /*
        ...................comment out respecive to test...................
         */

//        get call all the defaults
//        GrandDaughter gd=new GrandDaughter();

//        get's call the parent class only
//        Parent p=new Parent(4);

//        get's call the daugher class with y along default parent class
//        Daughter d=new Daughter(5);

//        get's called the granddaughter with default parent and daughter class
//        GrandDaughter gd1=new GrandDaughter(6);

//        calling all the previous classes
        GrandDaughter gd2=new GrandDaughter(1,2,3);




    }

}
