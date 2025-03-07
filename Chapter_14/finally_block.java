package Chapter_14;

public class finally_block {

    static int getOutput(){

        try{
            int a=50;
            int b=0;
            return a/b;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("end of code");
        }
        return 0;

    }

    public static void main(String[] args) {
       int k=getOutput();
        System.out.println(k);

    }
}
