package day41_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public class ArraysAsList {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(23, 1,34,54,654);
        System.out.println(nums);
       // nums.add(45); wont work with Arrays.asList method
        // work around
        List<Integer> numsList = new ArrayList<>(Arrays.asList(4, 2,4,23,54,25,100));

        //Drinks with Caffin

        List<String> drinks = new ArrayList<>(Arrays.asList("coffee", "tea", "monster", "red bull", "coke", "pepsi", "mdew", "kambucha"));

        for (String each: drinks) {
            int caffineAmmount =0;
            switch (each) {
                case "monster": case "red bull": case "celsius":
                    caffineAmmount = 150;
                    break;
                case "coffee": case "kambucha":
                    caffineAmmount = 112;
                    break;
                case "tea": case "coke": case"pepsi": case "mdew":
                caffineAmmount =35;

            }
            System.out.println("caffineAmmount = " + caffineAmmount);
        }

        drinks.forEach(each -> System.out.println(each.toUpperCase(Locale.ROOT)));


    }
}
