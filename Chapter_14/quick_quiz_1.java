package Chapter_14;

import java.util.Scanner;

public class quick_quiz_1 {
    public static void main(String[] args) {
        int[] marks=new  int[5];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        marks[4]=50;


        Scanner user=new Scanner(System.in);
        boolean running=true;

        while (running){
            try {
                System.out.println("Enter valid index(<5) to get the value: ");
                int i=user.nextInt();
                System.out.println("Value at\t"+i+"\tindex\t"+marks[i]);

            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
                System.out.println("Please enter a valid index");
                running=false;
            }
        }
        System.out.println("Thanks for using this program");

    }
}
