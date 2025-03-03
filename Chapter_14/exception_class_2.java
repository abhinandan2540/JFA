package Chapter_14;

class MyException2 extends Exception{
    @Override
    public String toString() {
        return "I am toString()";
    }

    @Override
    public String getMessage() {
        return "I am getMessage()";
    }
}

public class exception_class_2 {
    public static void main(String[] args) {
        try{
            throw new MyException2();
        }
        catch (Exception e){

            System.out.println(e.getMessage());
            System.out.println(e.toString());

        }
    }
}
