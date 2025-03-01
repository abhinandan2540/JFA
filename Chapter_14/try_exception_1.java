package Chapter_14;

public class try_exception_1 {
    public static void main(String[] args) {
        int a=1000;
        int b=0;

//        without try catch block
        /*

        int c=a/b;
        System.out.println("answer : "+c);

         */

//        with try catch

//        better approach of doing problems
        try {
            int c = a / b;
            System.out.println("answer: " + c);
        }
        catch (Exception e){
            System.out.println(e);
            System.out.println("end of program");
        }

    }
}
