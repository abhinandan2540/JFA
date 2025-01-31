package Chapter_02;

public class Operation {
    public static void main(String[] args) {
        int num=10;
        System.out.println(num++);//10
        System.out.println(num); //10+1 =11

        System.out.println(++num); // 11+1 = 12
        System.out.println(num);//12

        int num2=10;
        System.out.println(num2--); //10
        System.out.println(num2); //10-1 = 9

        System.out.println(--num2); // 10 -1 = 9
        System.out.println(num2);//9

    }
}
