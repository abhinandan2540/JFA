package Chapter_11;
// ANOTHER CLASSIC MOBILE EXAMPLE FOR UNDERSTANDING DEFAULT, PRIVET CONCEPT IN INTERFACES

interface CAMERA{
    void takePhoto();
    void takeVideo(int resolution);
}
interface MULTIMEDIA{
    void playMusic();
    void playVideo(int resulution);
}
interface WEB{
//    taking vargs string array as input
    void getWebList(String... wifiarr);

}

class KEYPADMobiles{
    public void callFunction(){
        System.out.println("Mobile for calling functionality");
    }
}

class SMARTPhone extends KEYPADMobiles implements CAMERA,MULTIMEDIA,WEB{
    @Override
    public void callFunction() {
        super.callFunction();
    }

    @Override
    public void takePhoto() {
        System.out.println("taking snaps");
    }

    @Override
    public void takeVideo(int resolution) {
        System.out.println("taking video on "+resolution+"p");
    }

    @Override
    public void playVideo(int resolution) {
        System.out.println("playing audio visual on "+resolution+"p");
    }

    @Override
    public void playMusic() {
        System.out.println("playing music");
    }

    @Override
    public void getWebList(String... wifiarr) {

        for(String wifi:wifiarr){
            System.out.println(wifi);
        }
    }
}

public class interfaces_6 {
    public static void main(String[] args) {

        SMARTPhone ph=new SMARTPhone();
        ph.callFunction();
        ph.getWebList("jio","airtel","chsl");
        ph.takeVideo(1080);
        ph.playVideo(720);
        ph.playMusic();


    }

}
