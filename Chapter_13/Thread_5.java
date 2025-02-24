package Chapter_13;

class Th5 implements Runnable{
    public void run(){
        System.out.println(Thread.currentThread().getName()+" is running ");
    }
}
public class Thread_5 {
    public static void main(String[] args) {
        Th5 task= new Th5();
        Thread th1=new Thread(task,"thread 1");
        Thread th2 = new Thread(task, "thread 2");
        th1.start();
        th2.start();

    }
}
