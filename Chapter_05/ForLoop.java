package Chapter_05;

public class ForLoop {
    public static void main(String[] args) {

//        simple for loop
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }

//        quiz 1
        for(int i=1;i<=10;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }

//        decrement
        for(int i=10;i>=1;i--){
            System.out.println(i);
        }


    }
}
