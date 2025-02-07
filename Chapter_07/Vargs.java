package Chapter_07;

public class Vargs {
//    wihtout vargs
    static int addNumbers(int a, int b){
        return a+b;
    }
//    with vargs
    static int addNumbers(int... numbers){
        int sum=0;
        for(int number: numbers){
            sum+=number;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("add: "+ addNumbers(2,3));
        System.out.println("add: "+ addNumbers(2,3,4));
    }
}
