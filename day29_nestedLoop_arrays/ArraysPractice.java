package day29_nestedLoop_arrays;

public class ArraysPractice {
    public static void main(String[] args) {
        int[] nums = new int[2];
        System.out.println(nums[0]); // 0 if not assigned. default value.{0,0}
        double prices[] = {2.5, 6.87, 9.8, 88.5, 3.4, 6.87,6.3, 99.87};
        for(int i=0; i< prices.length; i++){
            System.out.println("price = " + prices[i]);
        }

    }
}
