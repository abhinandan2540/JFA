package Chapter_04;

import java.util.Scanner;

public class CC3 {
    public static void main(String[] args) {

//        enhances switched cases
        System.out.println("enter fruit name : ");
        Scanner input=new Scanner(System.in);
        String var=input.next();
        switch (var){
            case "litchi"-> System.out.println("this is not what it is");
            case "lemon" -> System.out.println("complete polar opposit");
            case "papaya" -> System.out.println("you should really consult with doc");
            case "mango" -> System.out.println("there it is boy");
            default -> System.out.println("it alwasys mango in itself");

        }
    }
}
