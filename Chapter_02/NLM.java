package Chapter_02;

import java.util.Scanner;

public class NLM {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("enter v: ");
        int v=input.nextInt();
        System.out.println("enter u: ");
        int u=input.nextInt();
        System.out.println("enter s: ");
        int s=input.nextInt();

        float ans=(v*v)-(u*u)/(2*9.8f*s);
        System.out.println(ans);
    }
}
