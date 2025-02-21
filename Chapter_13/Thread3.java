package Chapter_13;

class MyThreadRunnable1 implements Runnable{
    public void run(){
        int i=1;
        while (i<1000){
            System.out.println("runnable thread running 1111");
            i+=1;
        }
    }
}

class MyThreadRunnable2 implements Runnable{
    public void run(){
        int i=1;
        while (i<1000){
            System.out.println("runnable thread running 2222");
            i+=1;
        }
    }
}

class MyThreadRunnable3 implements Runnable{
    public void run(){
        int i=1;
        while (i<1000){
            System.out.println("runnable thread running 3333");
            i+=1;
        }
    }
}

class MyThreadRunnable4 implements Runnable{
    public void run(){
        int i=1;
        while (i<1000){
            System.out.println("runnable thread running 4444");
            i+=1;
        }
    }
}

public class Thread3 {
    public static void main(String[] args) {

        /*

        SO THE ANALOGY SHOULD BE
        1. hold the bullet
        2. load the bullet into the gun
        3. fire the bullet

        1. bullet (1/2/3/4) --> hold the bullet
        2.Thread gun1/2/3/4 =new Thread(bullet1/2/3/4); --> loading the bullet into gun
        3.gun1/2/3/4.start(); --> firing the bullet

         */

        MyThreadRunnable1 bullet1 = new MyThreadRunnable1();
        Thread gun1=new Thread(bullet1);
        gun1.start();

        MyThreadRunnable2 bullet2 = new MyThreadRunnable2();
        Thread gun2=new Thread(bullet2);
        gun2.start();

        MyThreadRunnable3 bullet3 = new MyThreadRunnable3();
        Thread gun3=new Thread(bullet3);
        gun3.start();

        MyThreadRunnable4 bullet4 = new MyThreadRunnable4();
        Thread gun4=new Thread(bullet4);
        gun4.start();


    }
}
