package day43_arraylist_customClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class ArrayListWithListReturn {
    public static void main(String[] args) {
        System.nanoTime();
        List<Integer> nums = getIntegerList();
       // System.out.println("nums = " + nums);


     int [] numbers = getIntArray();
     //   System.out.println(Arrays.toString(numbers));


    }

    public static List<Integer> getIntegerList(){
        List<Integer> list = new ArrayList<>();
        long start = System.nanoTime();
        for(int i =0; i <=1000000; i++) {
            list.add(i);
        }
        long end = System.nanoTime();
        System.out.println("time for arraylist creation = " + ((end - start)/1000000));
        return list;
    }

    public static int[] getIntArray(){
        int[] nums = new int[1000001];
        long start = System.nanoTime();
        for(int i=0 ; i<=1000000; i++){
            nums[i] = i;
        }
        long end = System.nanoTime();
        System.out.println("Time to creat array " + ((end - start)/1000000));
        return nums;
    }
}
