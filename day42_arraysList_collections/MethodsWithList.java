package day42_arraysList_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MethodsWithList {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("Java", "is", "fun"));
        printStrList(words);

        List<Integer> nums = new ArrayList<>(Arrays.asList( 32,45,85,74,63));
        System.out.println(sumOfInt(nums));
    }

    public static int sumOfInt(List<Integer> list){
        int sum = 0;
        for(int nums : list){
            sum += nums;
        }
        return sum;
    }

    public static void printStrList(List<String> words){
        for(String each: words){
            System.out.print(each + " ");
        }

    }
}
