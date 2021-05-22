package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortingList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(36, 5, 8, 96, 75 , 82 , 3));
        System.out.println(nums);
        Collections.sort(nums);
        System.out.println("after sorting"+ nums);
    }
}
