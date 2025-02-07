package Chapter_07;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci_series {
//    recursive fibonacci

    static int fibonacci(int n){
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

    public static void main(String[] args) {
//        looping fibonacci
        System.out.println("upto n num of fibonacci : ");
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] fibonacci = new int[n];
        fibonacci[0]=0;
        fibonacci[1]=1;
        for(int i=2;i<n;i++){
            fibonacci[i]=fibonacci[i-1]+fibonacci[i-2];

        }
        System.out.println(Arrays.toString(fibonacci));


//        recursive
        int num = 10; // Number of Fibonacci numbers to print
        System.out.print("Fibonacci Sequence: ");
        for (int i = 0; i < num; i++) {
            System.out.print(fibonacci(i) + (i < num - 1 ? ", " : ""));
        }
        System.out.println();

    }
}
