package Chapter_13;


class thq2 extends Thread{
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("Thread 1111");
            try {
//                Thread.sleep(1000);
                Thread.sleep(200);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            i+=1;
        }
    }
}

public class thread_q_2 {
    public static void main(String[] args) {
        thq2 t2= new thq2();
        t2.start();
    }
}
