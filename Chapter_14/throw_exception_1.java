package Chapter_14;

import java.util.Scanner;

public class throw_exception_1 {
    public static void main(String[] args) {

        System.out.println("Enter a num to divide 10");
        Scanner sc=new Scanner(System.in);

        float num1=10f;
        float num2=sc.nextFloat();

        try{
            if(num2==0){
                throw new ArithmeticException("divide by 0?");
            }
            float ans=num1/num2;
            System.out.printf("%.2f",ans);
        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}
