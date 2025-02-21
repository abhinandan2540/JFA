package Chapter_13;
class MyThreadp1 extends Thread{

    public void run(){
        int i=1;
        while(i<1000){
            System.out.println("thread running 1111");
            i+=1;
        }
    }
}
class MyThreadp2 extends Thread{
    public void run(){
        int i=1;
        while(i<1000){
            System.out.println("Thread running 22222222");
            i+=1;
        }
    }
}

class MyThreadp3 extends Thread{
    public void run(){
        int i=1;
        while (i<1000){
            System.out.println("thread running 33333");
            i+=1;
        }
    }
}

class MyThreadp4 extends Thread{
    public void run(){
        int i=1;
        while (i<1000){
            System.out.println("thread running 44444444");
            i+=1;
        }
    }
}
public class Threading2 {
    public static void main(String[] args) {
        MyThreadp1 p1=new MyThreadp1();
        MyThreadp2 p2=new MyThreadp2();
        MyThreadp3 p3=new MyThreadp3();
        MyThreadp4 p4=new MyThreadp4();

        p1.start();
        p2.start();
        p3.start();
        p4.start();
    }
}
