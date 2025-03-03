package Chapter_14;

class MyException1 extends Exception{
    public MyException1(String message){
        super(message);
    }
}

public class exception_class_1 {
    public static void main(String[] args) {
        try{
            throw new MyException1("This is a new exception class");
        }
        catch (Exception e){
            System.out.println("Caught: "+e.getMessage());
        }
    }
}
