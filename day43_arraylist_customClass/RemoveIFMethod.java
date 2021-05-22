package day43_arraylist_customClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RemoveIFMethod {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(10,5,1,25,35,4,84,63));

        //remove odd numbers
        nums.removeIf( n -> n%2 !=0);
        System.out.println("nums = " + nums);
    }
}
