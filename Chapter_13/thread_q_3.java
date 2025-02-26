package Chapter_13;

class thq3 extends Thread{
    public thq3(String name){
        super(name);
    }

    public void run(){
        while (true){
            System.out.println("This is "+this.getName());
            System.out.println(this.getPriority());
        }

    }
}


public class thread_q_3 {
    public static void main(String[] args) {
        thq3 t1=new thq3("avvvv");
        thq3 t2=new thq3("mvvvv");
        t1.setPriority(Thread.NORM_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();


    }
}
