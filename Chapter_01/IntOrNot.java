package Chapter_01;

import java.util.Scanner;

public class IntOrNot {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter integer number :");
        int number=input.nextInt();
        if(number%2==0){
            System.out.println("even number");
        }else{
            System.out.println("odd number");
        }
    }
}
