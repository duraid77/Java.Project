package day42_arraysList_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class UniqueFromList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(2,4,4,1,5, 6, 0, 6,9,1,0));
        ArrayList<Integer> uniqueNums = new ArrayList<>();

        System.out.println(findUnique(nums));

    }



    public static List<Integer> findUnique(List<Integer> nums){
        ArrayList<Integer> uniqueNums = new ArrayList<>();
        for(int num: nums){
            if(Collections.frequency(nums, num) == 1){
             //   System.out.println("number " + num + " is unique") ;
                uniqueNums.add(num);
            }
        }
        return uniqueNums;
    }
}
