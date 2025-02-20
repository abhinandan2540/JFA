package SpecialQuestion.shape;

class Square{
    int len;
    public void setLen(int l){
        this.len=l;
    }
    public void getArea(){
        int area=len*len;
        System.out.println("Area of Square: "+area);
    }

}

class Rectangle extends Square{
     int wid;
    public void setLen(int l, int w) {
        super.setLen(l);
        this.wid=w;
    }

    public void getArea() {
       int area=len*wid;
        System.out.println("Area of Rectangle :"+area);
    }

    public void getPerimeter(){
        int perimeter=2*(len+wid);
        System.out.println("Perimeter of Rectangle :"+perimeter);
    }

}

class Sphere{
    int rad;
    public void setRad(int r){
        this.rad=r;
    }
    public void getArea(){
        float area=4*3.14f*rad*rad;
        System.out.printf("Area of Sphere : %.2f\n ",area);

    }

    public void getVolume(){
        float volume=(4f/3f)*3.14f*rad*rad*rad;
        System.out.printf("Volume of Sphere : %.2f\n",volume);
    }

}
class Cylinder extends Sphere{
    int hei;

    public void setRadHei(int r, int h) {
        super.setRad(r);
        this.hei=h;
    }

    public void getArea() {
        float area=2*3.14f*rad*(rad+hei);
        System.out.printf("Area of Cylinder : %.2f\n ",area);
    }

    public void getVolume() {
        float volume=3.14f*rad*rad*hei;
        System.out.printf("Volume of Cylinder :%.2f\n ",volume);
    }
}


public class GeoShapes {
    public void SquareProperty(int l){
        Square sqr=new Square();
        sqr.setLen(l);
        sqr.getArea();
    }
    public void RectangleProperty(int l, int w){
        Rectangle rec=new Rectangle();
        rec.setLen(l,w);
        rec.getArea();
        rec.getPerimeter();
    }

    public void SphereProperty(int r){
        Sphere sph=new Sphere();
        sph.setRad(r);
        sph.getArea();
        sph.getVolume();
    }

    public void CylinderProperty(int r, int h){
        Cylinder ch=new Cylinder();
        ch.setRadHei(r,h);
        ch.getArea();
        ch.getVolume();
    }

}
