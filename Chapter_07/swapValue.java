package Chapter_07;

public class swapValue {
    static void changeInteger(int x){
        x=98;
    }

    static void changeArray(int[] array){
        array[0]=100;
    }
    public static void main(String[] args) {
//        for integer
    int a=45;
    changeInteger(a);
        System.out.println("value :"+a);
//        for array
        int[] marks={10,20,30};
        changeArray(marks);
        System.out.println("marks :"+marks[0]);

    }
}
