package Chapter_13;

class thq5 extends Thread{

    public void run(){
        while (true){
            System.out.println("This is "+this.getName());
            System.out.println(Thread.currentThread());


        }

    }
}


public class thread_q_5 {
    public static void main(String[] args) {
        thq5 t1 = new thq5();
        t1.start();

    }
}