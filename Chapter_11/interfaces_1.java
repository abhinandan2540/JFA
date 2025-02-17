package Chapter_11;
interface Bicycle{
     void cycleSpeed(int decRate);
     void cycleBreak(int speedRate);

}
class AvonCycle implements Bicycle{

    public int c_speed_constant=10;
    public int c_break_constant=10;

    @Override
    public void cycleSpeed(int decRate) {
        int ans_speed=c_speed_constant-decRate;
        System.out.println("Avon cycle speed :"+ans_speed);
    }

    @Override
    public void cycleBreak(int speedRate) {
        int ans_break=speedRate-c_break_constant;
        System.out.println("Avon break :"+ans_break);
    }
}

public class interfaces_1 {
    public static void main(String[] args) {
//        obj creating and ops
        Bicycle myCycle= new AvonCycle();
        myCycle.cycleBreak(5);
        myCycle.cycleSpeed(6);

    }
}
