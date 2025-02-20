package SpecialQuestion;
import SpecialQuestion.calculator.Calculator;

public class usingCalculator {
    public static void main(String[] args) {
        Calculator ad=new Calculator();

//        BASIC CALCULATOR FUNC...
        System.out.println("sum : "+ad.addition(2,3));
        System.out.println("subs: "+ad.subtraction(2,3));
        System.out.println("multi: "+ad.multiplication(2,3));
        System.out.printf("divi: %.2f",ad.division(2,3));
//
//        TRIGO FUNC..
        System.out.printf("Sin value : %.2f\n",ad.sin(30));
        System.out.printf("Cos value : %.2f\n",ad.cos(60));
        System.out.printf("Tan Value : %.2f\n",ad.tan(45));
        System.out.printf("Cosec Value :%.2f\n",ad.cosec(30));
        System.out.printf("Sec value : %.2f\n",ad.sec(60));
        System.out.printf("Cot Value :%.2f\n",ad.cot(50));

    }
}
