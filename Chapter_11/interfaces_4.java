package Chapter_11;
interface IndianTruck{
    void safe();
    void comfort();
}
interface IndianTruckHorn{
    void MMKL();
    void JTJL();
}

class RoadTrip implements IndianTruck,IndianTruckHorn{
    @Override
    public void safe() {
        System.out.println("safety : 2*");
    }

    @Override
    public void comfort() {
        System.out.println("comfort : 3*");
    }

    @Override
    public void MMKL() {
        System.out.println("horn 1: Mujhse Mohabbat Ka Izhar");
    }

    @Override
    public void JTJL() {
        System.out.println("horn 2: Jeeta Tha Jiske Liye");
    }
}

public class interfaces_4 {
    public static void main(String[] args) {
        RoadTrip irt=new RoadTrip();
        irt.safe();
        irt.comfort();
        irt.JTJL();
        irt.MMKL();

    }
}
