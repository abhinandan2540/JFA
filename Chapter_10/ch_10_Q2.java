package Chapter_10;
class Rectangle{
    public int len;
    public int bre;
    public Rectangle(int l, int b){
        this.len=l;
        this.bre=b;
    }
    public void getArea(){
        int area=this.len*this.bre;
        System.out.printf("Area of Rectangle: %d",area);
    }
}

class Cuboid extends Rectangle{
    public int height;

    public Cuboid(int l,int b, int h){
        super(l,b);
        this.height=h;
    }
    @Override
    public void getArea(){
        int area=2*(len*bre + bre*height + height*len);
        System.out.printf("Area of Cuboid : %d%n",area);
    }

    public void getVolume(){
        float volume= (float) len*bre*height;
        System.out.printf("Volume of Cuboid : %.2f",volume);
    }
}
public class ch_10_Q2 {
    public static void main(String[] args) {

//        for rectangle
        Rectangle rt=new Rectangle(3,4);
        rt.getArea();

//        for cuboid
        Cuboid cb=new Cuboid(3,4,5);
        cb.getArea();
        cb.getVolume();

//        dynamic method dispatch
        Rectangle rc=new Cuboid(2,3,4);
        rc.getArea();


    }

}
