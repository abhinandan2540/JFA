package Chapter_06;

import java.util.Arrays;

public class array1 {
    public static void main(String[] args) {
//        array declare can be done in 3 ways
//        1.
//
        int[] nums=new int[5];
        nums[0]=10;
        nums[1]=20;
        nums[2]=30;
        nums[3]=40;
        nums[4]=50;
//        for printing single element from the array
        System.out.println(nums[3]);
//        for printing all the element from the array
        System.out.println(Arrays.toString(nums));

//        2.
        int[] arrays={1,2,3,4,5};
        System.out.println(arrays[4]);
        System.out.println(Arrays.toString(arrays));

//        3.
        int[] marks;
        marks=new int[5];
        marks[0]=10;
        marks[1]=20;
        marks[2]=30;
        marks[3]=40;
        marks[4]=50;
        System.out.println(marks[4]);
        System.out.println(Arrays.toString(marks));




    }
}
