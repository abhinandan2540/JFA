package Chapter_04;

import java.util.Scanner;

public class QuestionPractice {
    public static void main(String[] args) {

//        Use effectively

        // Q1
        int a=10;
        if(a==11){
            System.out.println("i am 11");
        }else{
            System.out.println("i am not 11");
        }

//        Q 2
        System.out.println("Enter 3 subjects marks : ");
        System.out.println("Enter your salary :"); // Q3 usage
        System.out.println("Enter today's Name : "); //Q 4 usage
        System.out.println("Enter Year : "); //Q 5 usage
        System.out.println("Enter website url : "); //Q 6 usage
        Scanner input=new Scanner(System.in);
        int sub1=input.nextInt();
        int sub2=input.nextInt();
        int sub3=input.nextInt();

        int totalNumber=sub1+sub2+sub3;

        if(totalNumber >= 120 && (sub1 >= 33 && sub2 >=33 && sub3 >= 33)){
            System.out.println("you are passed");
        }else{
            System.out.println("you are failed");
        }

//        Q3

        int salary=input.nextInt();

        if(salary<250000){
            System.out.println("you in Tax Heaven");
        }

        if (salary >=250000 && salary <= 500000){
            float tax=(salary*5)/100f;
            System.out.printf("you paid around %.2f $ in tax",tax);
        } else if (salary >= 500000 && salary <= 1000000) {
            float tax=(salary*20)/100f;
            System.out.printf("you paid around %.2f $ in tax",tax);
        }else{
            float tax=(salary*30)/100f;
            System.out.printf("you paid around %.2f $ in tax",tax);
        }

//        Q 4
        String day=input.nextLine();
        switch (day){
            case "Monday", "monday" -> System.out.println(1+"st Day");
            case "Tuesday" , "tuesday" -> System.out.println(2+"nd Day");
            case "Wednesday" ,"wednesday" -> System.out.println(3+"rd Day");
            case "Thursday","thursday" -> System.out.println(4+"th Day");
            case "Friday","friday" -> System.out.println(5+"th Day");
            case "Saturday","saturday" -> System.out.println(6+"th Day");
            case "Sunday","sunday" -> System.out.println(7+"th Day");
        }

//        Q 5
        int year=input.nextInt();
        if (year %4 ==0 && (year %100 ==0 & year %400 ==0)){
            System.out.println("Leap year");
        }else{
            System.out.println("not leap year");
        }

//        Q 6
        String url=input.nextLine();
        if(url.endsWith(".com")){
            System.out.println("commercial website");
        } else if (url.endsWith(".org")) {
            System.out.println("organigational website");
        } else if (url.endsWith(".in")) {
            System.out.println("indian website");
        }else{
            System.out.println("not in my memory");
        }


    }
}
