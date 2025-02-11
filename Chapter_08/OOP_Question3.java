package Chapter_08;

class AboutSquare{
    int side;
    public int getSquare(){
        return side*side;
    }
    public int getPerimeter(){
        return 4*side;
    }
}

public class OOP_Question3 {
    public static void main(String[] args) {

        AboutSquare side=new AboutSquare();
        side.side=2;
        int square=side.getSquare();
        int perimeter=side.getPerimeter();

        System.out.println("square: "+square);
        System.out.println("perimeter: "+perimeter);


    }
}
