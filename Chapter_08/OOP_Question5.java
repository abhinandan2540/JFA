package Chapter_08;

class TommyVecetti{
    public void RockHitting(){
        System.out.println("Hitting...");
    }
    public void RockNumming(){
        System.out.println("Numming...");
    }
    public void RockFiring(){
        System.out.println("Firing...");
    }

}

public class OOP_Question5 {
    public static void main(String[] args) {
//object initialization
        TommyVecetti tommy=new TommyVecetti();
        tommy.RockHitting();
        tommy.RockNumming();
        tommy.RockFiring();

    }
}
