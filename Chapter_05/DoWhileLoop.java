package Chapter_05;

public class DoWhileLoop {
    public static void main(String[] args) {

        int num1=1;
        do{
            System.out.println(num1);
            num1++;
        }while (num1<=5);
//        you still think do-while compatible with while
//        analomy of do while
        int num2=1;
        do{
            System.out.println(num2);
            num2++;
        }while (num2>3);

//        question
        int num3=1;
        do{
            System.out.println(num3);
            num3++;
        }while (num3<=10);

    }
}
