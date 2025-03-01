package Chapter_14;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class try_catch_3 {
    public static void main(String[] args) {
        int[] marks=new int[3];
        marks[0]=10;
        marks[1]=10;
        marks[2]=10;
        System.out.print("Enter index (max 3) to get the value: ");
        Scanner user=new Scanner(System.in);
        int i=user.nextInt();

        try {
            System.out.println("JFA series for mastering java from basics");
            try {
                System.out.print("Value at "+i+" index: "+marks[i]);
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
