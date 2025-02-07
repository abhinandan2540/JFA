package Chapter_07;

public class methods2 {
//this method is now not belong to all class, it belong to certain object
    int addTwoNumber(int x, int y){
        int z;
        if(x>y){
            z=x*y;
        }else{
            z=x+y;
        }
        return z;
    }

    public static void main(String[] args) {

//        method calling
        int ans1;
        int ans2;
        methods2 object=new methods2();
        ans1=object.addTwoNumber(2,3);
        ans2=object.addTwoNumber(3,2);
        System.out.println(ans1);
        System.out.println(ans2);



    }
}
