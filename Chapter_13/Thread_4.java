package Chapter_13;

class Thr4 extends Thread{
    public Thr4(String name){
        super(name);
    }

    public void run(){
        int i=23;
        System.out.println("the thread is running");
    }
}

public class Thread_4 {
    public static void main(String[] args) {

        Thr4 t=new Thr4("i'm avvvvvv");
        t.start();
        System.out.println(t.getName());
        System.out.println(t.getClass());
        System.out.println(t.getId());

    }
}
