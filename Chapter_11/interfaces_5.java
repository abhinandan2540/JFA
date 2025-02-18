package Chapter_11;
interface MusicPlayer{
    void music();
}
interface GPS{
    void gps();
}
interface Camera{
    void camera();
}

class CellPhone{
    public void phone(){
        System.out.println("a mobile phone for calling services");
    }
}

class SmartPhone extends CellPhone implements GPS,Camera,MusicPlayer{
    @Override
    public void phone() {
        super.phone();
    }

    @Override
    public void gps() {
        System.out.println("a mobile phone for gps navigation system");
    }

    @Override
    public void music() {
        System.out.println("a mobile phone for music player");
    }

    @Override
    public void camera() {
        System.out.println("a mobile phone for recording device");
    }
}

public class interfaces_5 {
    public static void main(String[] args) {

//        but a cell phon can have only single utility
//        CellPhone cph=new SmartPhone();
//        cph.phone();
//        cph.music(); --> throws an error


////        s smart phone can have multiple utility
        SmartPhone ph=new SmartPhone();
        ph.phone();
        ph.gps();
        ph.camera();
        ph.music();
    }
}
