package Chapter_06;

import java.util.Arrays;
import java.util.Scanner;

public class Array_Questions {
    public static void main(String[] args) {
////        Q1
        float[] marks={5.4f,8.6f,4.6f,9.2f,11.3f};
        float sum=0f;
        for(int i=0;i<marks.length;i++){
            sum+=marks[i];
        }
        System.out.println(sum);
//// output : 39.1

////        Q2
////        1D array
        System.out.println("Enter num to search");
        Scanner user=new Scanner(System.in);
        int input=user.nextInt();
        int[] marks1 = {10, 20, 30, 40, 50};
        boolean present=false;
        for (int i = 0; i < marks1.length; i++) {
            if (marks1[i] == input) {
                present=true;
                break;

            }
        }
        if(present){
            System.out.println("present");
        }else{
            System.out.println("not present");
        }

////        Q3
////        1D array
        int[] marks2={11,22,33,44,55};
        float total=0f;
        for(int nums :marks2){
            total+=nums;
        }
        float average=total/(marks2.length);
        System.out.println(average);
////        output
////        33.0

////       Q4
        int[][] nums1={{1,2,3},{4,5,6}};
        int[][] nums2={{7,8,9},{10,11,12}};
        int[][] sum1=new int [2][3];

        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums1[i].length;j++){
                sum1[i][j]=nums1[i][j];
            }
        }

        for(int i=0;i<sum1.length;i++){
            for(int j=0;j<sum1[i].length;j++){
                sum1[i][j]+=nums2[i][j];
            }
        }
        System.out.println(Arrays.deepToString(sum1));
//
////        output :
////        [[8, 10, 12], [14, 16, 18]]

////        Q5
//        reversing 2D array

//        Transpose of Matrix
        int[][] flats={{1,2,3},{4,5,6},{7,8,9}};
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[j][i]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
//        output
//        1 4 7
//        2 5 8
//        3 6 9

//        Row Reversal
        for(int i=0;i<flats.length;i++){
            for(int j=flats[i].length-1;j>=0;j--) {
                System.out.print(flats[i][j]);
                System.out.print(" ");

            }
            System.out.println(" ");
            }
//        output
//        3 2 1
//        6 5 4
//        9 8 7
//        Column Reversal
        for(int i=flats.length-1;i>=0;i--){
            for(int j=0;j<flats[i].length;j++){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
//        output
//        7 8 9
//        4 5 6
//        1 2 3
//        Row & Column Reversal
        for(int i=flats.length-1;i>=0;i--){
            for(int j=flats[i].length-1;j>=0;j--){
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println(" ");
        }
//        output
//        9 8 7
//        6 5 4
//        3 2 1

//        Q6
        int[][] max_matrix={{1,2,3},{4,5,6},{7,8,9}};
        int max_num=0;
        for(int i=0;i<max_matrix.length;i++){
            for(int j=0;j<max_matrix[i].length;j++){
                if(max_matrix[i][j]>max_num){
                    max_num=max_matrix[i][j];
                }
            }
        }
        System.out.println(max_num);
//        output : 9

//        Q 7
        int[][] min_matrix={{1,2,3},{4,5,6},{7,8,9}};
////        deal with length
        int min_num=min_matrix.length;
        for(int i=0;i<min_matrix.length;i++){
            for(int j=0;j<min_matrix[i].length;j++){
                if(min_num>min_matrix[i][j]){
                    min_num=min_matrix[i][j];
                }
            }
        }
        System.out.println(min_num);
//        output : 1

//        Q 8
        int[][] sorted_matrix={{1,2,3},{4,6,5},{9,7,8}};
        boolean sorted_ask = false;
        for(int i=0;i<sorted_matrix.length;i++){
            for (int j=0;j<sorted_matrix[i].length-1;j++){
                if(sorted_matrix[i][j]>sorted_matrix[i][j+1]){
                    sorted_ask=true;
                    break;
                }
            }
        }
        if(sorted_ask){
            System.out.println("not sorted");
        }else{
            System.out.println("sorted");
        }

//        output : not sorted







    }
}
