package Chapter_07;
//calling a method

public class methods1 {
    static int addTwoNum(int x, int y){
        int z;
        if(x>y){
            z=x+y;
        }else{
            z=(x+y)*2;
        }
        return z;
    }
    public static void main(String[] args) {
        int c;
        int c1;
        c=addTwoNum(2,3);
        c1=addTwoNum(3,2);
        System.out.println(c);
        System.out.println(c1);

    }
}
