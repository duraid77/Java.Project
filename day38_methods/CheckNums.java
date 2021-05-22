package day38_methods;

public class CheckNums {
    public static void main(String[] args) {
        int[] nums = { 65, 32, 98, 76, 82, 37};
        int n = 98;
        System.out.println("Does " + n + " exists in array nums? " + checkNums(nums, n) );
    }

    public static boolean checkNums (int[] nums, int num){
        for(int each: nums){
            if(each == num){
                return true;
            }
        }
        return false;
    }
}
