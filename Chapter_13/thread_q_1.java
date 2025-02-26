package Chapter_13;

class thq1 extends  Thread{
    public void run(){
        while (true){
            System.out.println("good morning");
        }
    }
}

class thq1w extends Thread{
    public void run(){
        while (true){
            System.out.println("welcome ");
        }
    }
}
public class thread_q_1 {
    public static void main(String[] args) {
        thq1 q1gm = new thq1();
        thq1w wc = new thq1w();

        q1gm.start();
        wc.start();
    }
}
