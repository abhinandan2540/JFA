package Chapter_14;

public class throw_exception_3 {

//    creating a function
    static float divide(float a, float b){
        return a/b;
    }
    public static void main(String[] args) {

//        calling a function
        try{
            float ans=divide(5,5);
            System.out.println(ans);
        }
        catch (Exception e){
            System.out.println(e.getMessage());

        }


    }
}
