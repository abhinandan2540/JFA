package Chapter_08;

import java.util.concurrent.Callable;

class Circle{
    int radius;

    public void getCircleArea(){
        float area=3.14f*(radius*radius);
        System.out.println("Area: "+area);
    }

    public void getPerimeter(){
        float perimeter=2*(3.14f)*radius;
        System.out.println("Perimter: "+perimeter);
    }

}

public class OOP_Question6 {
    public static void main(String[] args) {

        Circle test=new Circle();
        test.radius=4;
        test.getCircleArea();
        test.getPerimeter();
    }
}
