package day40_arraylist;
import  java.util.*;

public class ArrayListLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(); //Polymorphic way of declaring

        System.out.println("nums = " + nums);
        System.out.println("nums.size() = " + nums.size());
        nums.add(34);nums.add(44);nums.add(3);nums.add(88);
        nums.add(4);nums.add(34);nums.add(34);nums.add(34);
        nums.add(97);nums.add(82);nums.add(30);nums.add(21);

        nums.remove(0);
        nums.remove(new Integer(88));

        System.out.println("nums = " + nums);

        for(int i = 0; i< nums.size(); i++){
            System.out.println("nums.get(i) = " + nums.get(i));
        }

        for(Integer each: nums){
            System.out.println("each = " + each);
        }





    }
}
