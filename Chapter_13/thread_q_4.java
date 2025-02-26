package Chapter_13;

class thq4 extends Thread{

    public void run(){
        while (true){
            System.out.println("This is "+this.getName());

//            .getState() -> shows current state
            System.out.println(this.getState());
        }

    }
}


public class thread_q_4 {
    public static void main(String[] args) {
        thq4 t1=new thq4();
        thq4 t2=new thq4();
        t1.start();
        t2.start();


//        .getState() returns
        /*
        NEW
        RUNNABLE
        BLOCKED
        WAITING
        TIMED_WAITING
        TERMINATED
         */



    }
}
