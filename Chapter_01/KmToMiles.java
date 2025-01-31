package Chapter_01;

import java.util.Scanner;

public class KmToMiles {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("KM : ");
        int KM=input.nextInt();
        double KTM=KM*0.621371;
        System.out.println(KTM);
    }
}
