package Chapter_09;

class setCircle{
    private int r;
    public void setRadius(int radius){
        this.r=radius;
    }
    public float getPerimter(){
        float perim=2*3.14f*r;
        return perim;
    }
    public float getArea(){
        float area=3.14f*r*r;
        return area;
    }
}

public class circleModifier {
    public static void main(String[] args) {
        setCircle av=new setCircle();
        av.setRadius(4);
        System.out.println("perimter: "+av.getPerimter());
        System.out.println("Area: "+av.getArea());
    }

}
