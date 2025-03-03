package Chapter_14;


import java.util.Scanner;

class MyAgeException extends Exception{
    @Override
    public String getMessage() {
        return "Age can't be negative and >130";
    }
}

public class throw_exception_2 {
    public static void main(String[] args) {

        System.out.println("Enter age: ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        try{
            if(age<0 || age>130){
                throw new MyAgeException();
            }
            System.out.println("valid age");
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
