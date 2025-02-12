package Chapter_09;

class SphereCons{
    int r;
    public SphereCons( int myrad){
        this.r=myrad;
    }
    public void getArea(){
        float area=4*3.14f*r*r;
        System.out.printf("Area: %.2f%n",area);
    }
    public void getVolume(){
        float volume=(4f/3f)*3.14f*r*r*r;
        System.out.printf("Volume: %.2f",volume);
    }
}

public class Sphere_constructor {
    public static void main(String[] args) {
        SphereCons av=new SphereCons(4);
        av.getArea();
        av.getVolume();

    }
}
