package Chapter_06;

public class array2 {
    public static void main(String[] args) {
//        array length
        int[] nums={10,20,30,40,50};
        System.out.println("array length");
        System.out.println(nums.length);

//        printing using for loop
//
        System.out.println("for loop");
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]);
        }

//        printing in reverse order
        System.out.println("reverse for loop");
        for(int i=nums.length-1;i>=0;i--){
            System.out.println(nums[i]);
        }

//        for each loop
        System.out.println("for each loop");
        for(int element : nums){
            System.out.println(element);
        }



    }
}
