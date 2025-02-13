package Chapter_09;

class GuessNum{

    private int num=(int)(Math.random()*100);

    public void guessNum(int mynum){
        if (num==mynum){
            System.out.println("correct guess");
        }else{
            System.out.println("False,correct num :"+num);
        }
    }

}

public class GTN {
    public static void main(String[] args) {

        GuessNum av=new GuessNum();
        av.guessNum(60);

    }
}
