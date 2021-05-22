package day23_Strings_whileLoops;

import java.util.Locale;

public class ChainingStringmethods {
    public static void main(String[] args) {
        String word ="wooden spoon";
        System.out.println(word.toUpperCase().toLowerCase().length());// after length you can not chain anymore.

        String city = "chicago";
        String upper = city.toUpperCase().substring(0,1) + city.toLowerCase().substring(1);
        System.out.println(upper);

    }
}
