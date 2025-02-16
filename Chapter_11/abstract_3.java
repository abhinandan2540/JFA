package Chapter_11;
abstract class Shape{
    abstract public void getArea();
    abstract public void getPerimeter();
}
class Circle extends Shape{
    public int rad;

    public Circle(int r){
        this.rad=r;
    }

    @Override
    public void getArea() {
        float area=3.14f*rad*rad;
        System.out.printf("Circle Area :%.2f\n",area);
    }

    @Override
    public void getPerimeter() {
        float perimeter=2*3.14f*rad;
        System.out.printf("Circle Perimeter : %.2f\n",perimeter);
    }
}

class Square extends Shape{
    public int x;
    public int y;

    public Square(int a, int b){
        this.x=a;
        this.y=b;
    }

    @Override
    public void getArea() {
        int area=x*y;
        System.out.println("Rectangle Area : "+area);
    }

    @Override
    public void getPerimeter() {
        int perimeter=2*(x+y);
        System.out.println("Rectangle Perimeter: "+perimeter);
    }
}
public class abstract_3 {
    public static void main(String[] args) {
        Circle cr=new Circle(5);
        cr.getArea();
        cr.getPerimeter();
        Square sr=new Square(4,5);
        sr.getArea();
        sr.getPerimeter();
    }
}
