package Chapter_06;

import java.util.Arrays;

public class array2D {
    public static void main(String[] args) {
//        2D array
        int[][] marks=new int[2][3];
        marks[0][0]=10;
        marks[0][1]=20;
        marks[0][2]=30;
        marks[1][0]=40;
        marks[1][1]=50;
        marks[1][2]=60;
        System.out.println(Arrays.deepToString(marks));
//        Arryas.deepToString() : for visualize 2D array
//        output looks like : [[10, 20, 30], [40, 50, 60]]

//        iterating over each element using for loop
        for(int i=0;i<marks.length; i++){
            for(int j=0;j<marks[i].length;j++){
                System.out.print(marks[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
//        output :
//        10 20 30
//        40 50 60
    }
}
