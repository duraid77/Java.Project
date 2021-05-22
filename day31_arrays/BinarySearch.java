package day31_arrays;
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {

        int[] nums = {21, 3, 6, 9,63, 32, 98, 15};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.binarySearch(nums, 63));
        if(Arrays.binarySearch(nums, 98)>=0){
            System.out.println("98 is presetn");
        }else{
            System.out.println("not found");
        }
    }
}
