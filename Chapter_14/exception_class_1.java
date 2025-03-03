package Chapter_14;

/*
Exception is a built-in class in Java, found in the java.lang package.
It is the parent class for all exceptions that can be caught and handled using try-catch.
It extends the Throwable class, which allows exceptions to be thrown and caught.

 */

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
