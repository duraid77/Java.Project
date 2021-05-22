package day29_nestedLoop_arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        int[] nums = new int[3]; //array variable
        nums[0]= 5;
        nums[1] = 8;
        nums[2] = 14;

        int len = nums.length;
        System.out.println("len = " + len);

        for(int i=0; i<3; i++){
            System.out.println("nums = " + nums[i]);
        }
    }
}
