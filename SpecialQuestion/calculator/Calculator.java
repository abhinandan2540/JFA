package SpecialQuestion.calculator;

/*
           I DON'T REALLY NEED THIS NUMBERCALCULATION STUFF'S , JUST MAKE IT OUT OF NOWHERE
           BUT FOR TRIGO CALCULATION, TRIGO IS IMPORTANT TO GET THROUGH
 */

class NumberCalculation{
    int x;
    int y;
    public void getNumber(int a,int  b){
        this.x=a;
        this.y=b;
        System.out.println("setting a: "+a);
        System.out.println("setting b: "+b);
    }


}
 class Addition extends NumberCalculation{
    public int NumberAddition(int a,int b){
        super.getNumber(a,b);
        return a+b;
    }
 }
class Multiplication extends NumberCalculation{
    public int NumberMultiplication(int a,int b){
        super.getNumber(a,b);
        return a*b;
    }
}

class Subtraction extends NumberCalculation{
    public int NumberSubtraction(int a, int b){
        super.getNumber(a,b);
        return a-b;
    }
}
class Division extends NumberCalculation{
    public float NumberDivision(float a, float b){
        return (a/b);
    }
}


class Trigonometry {
    double Radian;
       public void DegreeToRadians(double Degree){
           this.Radian= Math.toRadians(Degree);
       }
}

class SinValue extends Trigonometry{
    public double getSin(double Degree){
        super.DegreeToRadians(Degree);
        return Math.sin(Radian);
    }
}

class CosValue extends Trigonometry{
    public double getCos(double Degree){
        super.DegreeToRadians(Degree);
        return Math.cos(Radian);
    }
}

class TanValue extends Trigonometry{
    public double getTan(double Degree){
        super.DegreeToRadians(Degree);
        return Math.tan(Radian);
    }
}

class CosecValue extends SinValue{
    public double getCosec(double Degree){
        return (1/super.getSin(Degree));
    }
}

class CotValue extends TanValue{
    public double getCot(double Degree){
        return (1/super.getTan(Degree));
    }
}

class SecValye extends CosValue{
    public double getSec(double Degree){
        return (1/super.getCos(Degree));
    }
}

public class Calculator {
    public int addition(int a, int b){
        Addition ad=new Addition();
        return ad.NumberAddition(a,b);
    }

    public int subtraction(int a, int b){
        Subtraction sb=new Subtraction();
        return sb.NumberSubtraction(a,b);
    }

    public int multiplication(int a, int b){
        Multiplication mp=new Multiplication();
        return mp.NumberMultiplication(a,b);
    }

    public float division(int a, int b){
        Division dv=new Division();
        return  dv.NumberDivision(a,b);
    }

    public double sin(double degree){
        SinValue sinV= new SinValue();
        return sinV.getSin(degree);
    }

    public double cos(double degree){
        CosValue cosV= new CosValue();
        return cosV.getCos(degree);
    }

    public double tan(double degree){
        TanValue tanV=new TanValue();
        return tanV.getTan(degree);
    }

    public double cosec(double degree){
        CosecValue cosecV=new CosecValue();
        return cosecV.getCosec(degree);
    }
    public double sec(double degree){
        SecValye secV=new SecValye();
        return secV.getSec(degree);
    }
    public double cot(double degree){
        CotValue cotV=new CotValue();
        return cotV.getCot(degree);
    }

}
