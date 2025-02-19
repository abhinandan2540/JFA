package Chapter_12;
class privetAcessModifier{
    private int a=34;
    private void display(){
        System.out.println("privet access modifier can't accessed");
    }
    public void display1(){
        System.out.println("public access modifier can accessed");
    }
}
public class privet_accessModifiers {
    public static void main(String[] args) {
        privetAcessModifier pvj=new privetAcessModifier();
        pvj.display1();
//        pvj.display() --> give error
//        pvj.a --> give error
    }
}
