package Chapter_12;
class defaultAcessModifier{
    void display(){
        System.out.println("default / no access modifier");
    }
}
public class default_accessModifier {
    public static void main(String[] args) {
        defaultAcessModifier df=new defaultAcessModifier();
        df.display();
    }
}
