package Chapter_09;



class CylinderClass{

//    r = radius, h = height
    private int r;
    private int h;

    public void setRadius(int myrad){
        this.r=myrad;
    }
    public void serHeight(int myheight){
        this.h=myheight;
    }

    public void getParams(){
        System.out.println("Radius: "+r+", height: "+h);
    }

    public void getSurfaceArea(){
        float surfarea=2*3.14f*r*(h+r);
        System.out.printf("Surface Area: %.2f%n",surfarea);
    }
    public void getVolume() {
        float vol = 3.14f * r * r * h;
        System.out.printf("Volume: %.2f",vol);
    }

}

public class Cylinder {
    public static void main(String[] args) {
        CylinderClass av=new CylinderClass();
        av.setRadius(4);
        av.serHeight(10);
        av.getParams();
        av.getSurfaceArea();
        av.getVolume();

    }
}
