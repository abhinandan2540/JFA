package Chapter_07;

public class Method_Question {
//    Q1 : multiplication table
    static void multiplicationTable(int n){
        for(int i=1;i<=10;i++){
            System.out.println(n+" x "+i+" = "+n*i);
        }
    }

//    Q2 : figure printing
    static void printFigure(int n){
        for (int i=1;i<=n;i++){
            for (int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

//    Q3 : sum of n nums
    static int nSum(int n){
        int sum=0;
        if(n<=0){
            return 0;
        }else{
            return n+nSum(n-1);
        }
    }

//    Q4:printing figure
    static void printNewFigure(int n){
        for (int i=n;i>=1;i--){
            for (int j=0;j<i;j++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println(" ");
        }
    }

//    Q5 : fibonacci series
    static int Fibonacci(int n){
        if (n<=1){
            return n;
        }else{
            return Fibonacci(n-1)+Fibonacci(n-2);
        }
    }

//    Q6 :
    static float nAverage(int ...arr){
        float sum=0f;
        int n=arr.length;
        for (int i=0;i<n;i++){
            sum+=arr[i];
        }
        return sum/n;

    }

//    Q7
        static int repeat4(int n){
            if (n>0){
                System.out.println(n);
            }
            return repeat4(n);
        }

//    Q8 : repeat 2
    static int repeat2(int n){
        if (n>0){
            System.out.println(n);
        }
        return repeat2(n);
    }

//    Q9 : c -> f
    static int celsiusToFarenhite(int n){
        return n+32;
    }

//    Q10
    static void repeat3(int n){
        while (n>0){
            System.out.println(n);
        }
    }



    public static void main(String[] args) {
//        Q1
        multiplicationTable(9);

//        Q2
        printFigure(4);

//        Q3
        int output=nSum(5);
        System.out.println(output);

//        Q4
        printNewFigure(4);

//        Q5
        int n=5;
        for (int i=0;i<n;i++){
            System.out.print(Fibonacci(i)+" ");
        }

//        Q6 : average of n numbers
       float avergae= nAverage(4,1,3,4,5,3,1,6);
        System.out.println(avergae);

//        Q 7
        repeat4(4);

//        Q8
        repeat2(2);

//        Q9
        int output1=celsiusToFarenhite(32);
        System.out.println(output1);

//        Q10
        repeat3(3);





    }
}
