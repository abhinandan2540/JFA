package Chapter_14;


class MyNegativeRadius extends Exception{
    @Override
    public String getMessage() {
        return "r can't be negative: example 2";
    }
}

public class throws_1 {

//    example 1
    static float divideNums(float a, float b){
        if(a==0 || b==0){
            throw new ArithmeticException("can't divide by 0: example 1");
        }
        return a/b;
    }

//    example 2
    static float CircleArea(float r) throws MyNegativeRadius{
        if (r<0){
            throw new MyNegativeRadius();
        }
        float area=(float) Math.PI*r*r;
        return area;
    }

//    exmaple 3
    static int perimeter(int x) throws ArithmeticException{
        return 4*x;
    }

    public static void main(String[] args) {

//        implementing example 1
        try{
            float ans=divideNums(2,0);
            System.out.println(ans);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

//        implementing example 2
        try{
            float ans=CircleArea(-2);
            System.out.println(ans);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

//        implementing example 3
        try{
            int ans=perimeter(0);
            if(ans<=0){
                throw new ArithmeticException("error : example 3");
            }
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }
}
