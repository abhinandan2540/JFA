package Chapter_11;

interface truck{
    void loadCarrier();
}
interface tractor{
    void farmersFriend();
}
class miniTruck{
    public void miniPickup(){
        System.out.println("helps in doing mini pickups");
    }
}
class tatatruck extends miniTruck implements truck,tractor{
    @Override
    public void miniPickup() {
        super.miniPickup();
    }

    @Override
    public void loadCarrier() {
        System.out.println("carry loads");
    }

    @Override
    public void farmersFriend() {
        System.out.println("helps farmers to do the works");
    }
}
public class polymorphism_1 {
    public static void main(String[] args) {
//        truck funtionality
//        truck tr=new tatatruck();
//        tr.loadCarrier();

//        tractor functions.
//        tractor tra=new tatatruck();
//        tra.farmersFriend();

//        mini truck funtions
//        miniTruck mn=new tatatruck();
//        mn.miniPickup();

//        all the functions
        tatatruck tt=new tatatruck();
        tt.farmersFriend();
        tt.miniPickup();
        tt.loadCarrier();

    }
}
