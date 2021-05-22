package day43_arraylist_customClass;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomList {
    public static void main(String[] args) {
        Random rnd = new Random();
        int size = rnd.nextInt(100);
        List<Integer> numbers = getRandom(size);
        System.out.println("numbers = " + numbers);
    }

    public static List<Integer> getRandom( int size){
        Random rnd = new Random();
        List<Integer> nums = new ArrayList<>();

        for(int i=0 ; i< size; i++){
            nums.add(rnd.nextInt(101));
        }
        return nums;
    }
}
