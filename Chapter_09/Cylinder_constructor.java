package Chapter_09;

class CylinderCons{
    int r;
    int h;

    public CylinderCons(int myrad, int myheight){
        this.r=myrad;
        this.h=myheight;
    }

    public void getSurfaceArea(){
        float surfArea=2*3.14f*r*(r+h);
        System.out.printf("Surface Area: %.2f%n",surfArea);
    }
    public void getVolume(){
        float vol=3.14f*r*r*h;
        System.out.printf("Volume: %.2f",vol);
    }
}

public class Cylinder_constructor {
    public static void main(String[] args) {
        CylinderCons av=new CylinderCons(4,10);
        av.getSurfaceArea();
        av.getVolume();
    }

}
