package Chapter_12.anotherPackage;
import Chapter_12.MyPackage.protected_parent;

public class protectec_child extends protected_parent {
    public void show(){
        System.out.println("Acessing Protected Method :"+value);
        display();
    }

    public static void main(String[] args) {
        protectec_child obj=new protectec_child();
        obj.show();
    }

}
