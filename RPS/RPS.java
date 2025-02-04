package RPS;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RPS {
    public static void main(String[] args) {
        System.out.println("Input 0=Rock, 1=Paper, 2=Scissor : ");
        Scanner input=new Scanner(System.in);
        String user_choice=input.nextLine();
        int computer_choice=(int)(Math.random()*3);

//        for this case let say we specifying 0 = Rock , 1 = Paper , 2 = Scissor
//        we'll cover the advance method for this in the upcoming repos
//        Integer.parseInt = for converting string  into int
//        Math.random() = random module for dealing with randomness

        if (computer_choice == 0 && Integer.parseInt(user_choice) == 0) {
            System.out.println("Draw");
        } else if (computer_choice == 0 && Integer.parseInt(user_choice) == 1) {
            System.out.println("User won");
        } else if (computer_choice == 0 && Integer.parseInt(user_choice) == 2) {
            System.out.println("Computer won");
        } else if (computer_choice == 1 && Integer.parseInt(user_choice) == 0) {
            System.out.println("User won");
        } else if (computer_choice == 1 && Integer.parseInt(user_choice) == 1) {
            System.out.println("Draw");
        } else if (computer_choice == 1 && Integer.parseInt(user_choice) == 2) {
            System.out.println("Computer won");
        } else if (computer_choice == 2 && Integer.parseInt(user_choice) == 0) {
            System.out.println("User won");
        } else if (computer_choice == 2 && Integer.parseInt(user_choice) == 1) {
            System.out.println("Computer won");
        } else {
            System.out.println("User won");
        }

    }
}
