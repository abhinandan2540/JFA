package Chapter_10;
class Circle1{
    public int rad;

    public Circle1(int my_radius){
        System.out.println("running from circle");
        this.rad=my_radius;
    }

    public void getArea(){
        float area=3.14f*rad*rad;
        System.out.printf("Area : %.2f",area);
    }
}

class Cylinder1 extends Circle1{
     public int height;

     public Cylinder1(int my_radius, int my_height){
         super(my_radius);
         System.out.println("running from cylinder");
         this.height=my_height;
     }

     @Override
     public void getArea(){
      float area=2*3.14f*rad*(height+rad);
         System.out.printf("Area of cylinder: %.2f",area);
     }
}

public class ch_10_Q1 {
    public static void main(String[] args) {

//        properties of circle
//
        Circle1 cr=new Circle1(4);
        cr.getArea();

//        properties of cylinder
        Cylinder1 cd=new Cylinder1(4,5);
        cd.getArea();

//        dynamic method dispatch
        Circle1 cr1=new Cylinder1(4,5);
        cr1.getArea();




    }
}
