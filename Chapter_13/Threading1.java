package Chapter_13;

class MyThread1 extends Thread{

    public void run(){
        while (true){
            System.out.println("Thread 1 is running");
            System.out.println("i am happy");
        }

    }

}

class MyThread2 extends Thread{
    public void run(){
        while (true){
            System.out.println("Thread 2 is running");
            System.out.println("i am sad");
        }

    }
}

public class Threading1 {
    public static void main(String[] args) {
        MyThread1 t1=new MyThread1();
        MyThread2 t2=new MyThread2();
        t1.start();
        t2.start();


    }
}
