package Chapter_13;

class Thrpri extends Thread{
    public Thrpri(String name){
        super(name);
    }

    public void run(){
        while (true){
            System.out.println("This is "+this.getName());
        }
    }

}
public class Thread_priority {
    public static void main(String[] args) {
        Thrpri t1=new Thrpri("avv 1 (most important)");
        Thrpri t2=new Thrpri("avv 2 (min important)");
        Thrpri t3=new Thrpri("avv 3 (normal important)");
//setting up the priority
        t3.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);
        t1.setPriority(Thread.NORM_PRIORITY);

//      running thread
        t1.start();
        t2.start();
        t3.start();


    }

}
