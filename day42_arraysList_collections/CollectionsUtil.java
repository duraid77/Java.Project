package day42_arraysList_collections;
import java.util.*;
public class CollectionsUtil {
    public static void main(String[] args) {
        List<Character> letters = new ArrayList<>();
        letters.addAll(Arrays.asList('j', 'a' , 'v' , 'a' , 'i' , 's' , 'f' , 'u' , 'n'));
        System.out.println("letters size = " + letters.size());


        Collections.reverse(letters);  // reverse the arraylist
        System.out.println(Collections.frequency(letters, 'a'));
        int vcount= Collections.frequency(letters, 'v');
        System.out.println("vcount = " + vcount);

        System.out.println("letters = " + letters);


        System.out.println("max char " + Collections.max(letters));
        System.out.println("min char = " + Collections.min(letters));

        Collections.reverse(letters);
        Collections.replaceAll(letters, 'a', 'u');
        System.out.println(letters);

        List<Integer> nums = new ArrayList<>(Arrays.asList(5,6,3,5,7,6,5,7,1,8,1,5,1));

        int countOfFives = Collections.frequency(nums, 1);
        System.out.println("countOfFives = " + countOfFives);

        Collections.replaceAll(nums, 5, 50);
        System.out.println("nums = " + nums);

        Collections.sort(nums, Collections.reverseOrder());
        System.out.println(nums);

        Collections.shuffle(nums);
        System.out.println("nums = " + nums);

    }
}
