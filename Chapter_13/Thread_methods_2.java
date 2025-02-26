package Chapter_13;

class ThMeth3 extends Thread{
  public void run(){
      int i=0;
      while (i<1000){
          System.out.println("Thread 1111");
          try {
              Thread.sleep(1000);
          } catch (InterruptedException e) {
              throw new RuntimeException(e);
          }
          i+=1;
      }
  }
}

class ThMeth4 extends Thread{
    public void run(){
        int i=0;
        while(i<1000){
            System.out.println("Thread 2222");
            i+=1;
        }
    }
}


public class Thread_methods_2 {
    public static void main(String[] args) {
        ThMeth3 t3= new ThMeth3();
        ThMeth4 t4= new ThMeth4();

        t3.start();
        t4.start();
    }
}
