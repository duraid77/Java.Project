package day33_arrays;

import java.util.Arrays;

public class SplitReview {
    public static void main(String[] args) {
        String word = "ajava";
        String [] arr = word.split("a");
        System.out.println(Arrays.toString(arr));
    }
}
