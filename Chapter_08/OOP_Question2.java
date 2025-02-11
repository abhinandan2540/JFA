package Chapter_08;

class CellPhone{
    String callName;

    public void calling(){
        System.out.println(callName+" calling...");
    }

    public void Ringing(){
        System.out.println(callName+" rining...");
    }

    public void Talking(){
        System.out.println(callName+" talking...");
    }

    public void Ending(){
        System.out.println("call end");
    }

}

public class OOP_Question2 {
    public static void main(String[] args) {

//        object initialization
        CellPhone abhi=new CellPhone();
        abhi.callName="X Æ A-Xii";

        abhi.calling();
        abhi.Ringing();
        abhi.Talking();
        abhi.Ending();


    }
}
