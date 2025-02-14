package Chapter_10;
class Phone{
    public void openMobile (){
        System.out.println("Open Mobile..");
    }
    public void callPerson(){
        System.out.println("calling person functionality");
    }
}

class SmartPhone extends Phone{
    public void capturePhoto(){
        System.out.println("capturing photo");
    }
    @Override
    public void callPerson(){
        System.out.println("call person & taking notes");
    }
}

public class Dynamic_method_dispatch {
    public static void main(String[] args) {

//        method first
//        Phone ph=new Phone();
//        ph.openMobile();
//        ph.callPerson();
//        SmartPhone smrtph=new SmartPhone();
//        smrtph.capturePhoto();
//        smrtph.callPerson();

//        method second
        Phone ph=new SmartPhone();
        ph.openMobile();
        ph.callPerson();

        /*
           ph.capturePhoto() // this is not possible, from the parent class we can able to make objects.
//        reverse is not possible
          a smart phon can be used as a normal phon (keypad phone) but a keypad phone can't be used as  smart phone

        so from parsent class, what we can do is to control or take all the children classes those are oeverrides
       ***  SEE THE NEXT EXAMPLE OF PAYMENT GATEWAY FOR MORE*********

         */
//





    }
}
