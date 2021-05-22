package officeHour.may_11;

import java.util.ArrayList;

public class SeparateParts {
    public static void main(String[] args) {
        /**
         * [Separate parts]
         *
         * Write a program that can extract the special characters, digits and letters from a string and stores them into separate ArrayLists of Characters
         *
         * Ex: str = "ABCD123$%#@&456EFG!"
         * list1: {$, %, #, @, &, !}
         * list2: {A, B, C, D, E, F, G}
         * list3: {1, 2, 3, 4, 5, 6}
         *
         * Challenge: make a method that will do this action and it will return an ArrayList which holds all 3 of the other ArrayLists
         * Challenge 2: do the original task again, but without a loop. Use lambda
         */
        String str = "ABCD123$%#@&456EFG!";
        ArrayList<Character> all = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            all.add(str.charAt(i));
        }



    }
}
