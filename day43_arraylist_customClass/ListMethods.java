package day43_arraylist_customClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListMethods {
    public static void main(String[] args) {
        List<String> days = getDays();
        System.out.println(days);

        days.removeIf(d -> d.length() == 6);
        System.out.println("days = " + days);
    }


    public static List<String> getDays(){
        List<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday" , "Wednesday", "Thursday" , "Friday" , "Saturday" , "Sunday"));
        return days;
    }
}
