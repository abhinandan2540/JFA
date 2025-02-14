package Chapter_10;

import java.security.PublicKey;

class Payment{
    public void makePayment(){
        System.out.println("payment processing...");
    }
}
class UPI extends Payment{
    @Override
    public void makePayment(){
        System.out.println("payment done via UPI...");
    }
}

class CreditCard extends Payment{
    @Override
    public void makePayment(){
        System.out.println("Payment done via CreditCard");
    }
}

class Cash extends Payment{
    @Override
    public void makePayment(){
        System.out.println("payment done via Cash");
    }
}

public class DMD_payments {
    public static void main(String[] args) {

        /*
        parsent class : payment
        children class : UPI,CreditCard,Cash
        we can call all the childrens from the parent (or you can say childrens comes from parent,not parsent comes from children)
         */

        /*
        comment out and see the results
         */

//        Payment av= new Payment();
//        av.makePayment();
//        Payment av= new Cash();
//        av.makePayment();
//        Payment av=new UPI();
//        av.makePayment();
        Payment av=new CreditCard();
        av.makePayment();
    }
}
