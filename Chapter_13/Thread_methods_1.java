package Chapter_13;

class ThMeth1 extends Thread{
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("Thread 111111");
            i+=1;
        }
    }
}

class ThMeth2 extends Thread{
    public void run(){
        int i=0;
        while (i<1000){
            System.out.println("Thread 2222");
            i+=1;
        }
    }
}
public class Thread_methods_1 {
    public static void main(String[] args) {
        ThMeth1 t1=new ThMeth1();
        ThMeth2 t2=new ThMeth2();

//        at first t1 will execute
        t1.start();

//        using .join(), it connect with t2 after t1 ending
        try {
            t1.join();
        }
        catch (Exception e){
            System.out.println(e);
        }

//        t2 will start after ending t1
        t2.start();

    }

}
