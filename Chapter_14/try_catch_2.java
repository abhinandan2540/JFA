package Chapter_14;

import java.util.Scanner;

public class try_catch_2 {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=10;
        marks[1]=10;
        marks[2]=10;

        System.out.println("Marks(3) enter index to get the marks: ");
        Scanner user= new Scanner(System.in);
        int index=user.nextInt();

        System.out.println("Enter marks that you like to divide with that marks: ");
        int num=user.nextInt();

        try{
            System.out.println("Respective marks: "+marks[index]);
            System.out.println("Divided result: "+marks[index]/num);
        }
        catch (ArrayIndexOutOfBoundsException | ArithmeticException e){
            System.out.println(e);
        }
        catch (Exception e){
            System.out.println("some exception occured");
            System.out.println(e);
        }


    }
}
