package day33_arrays;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        String[] friends ={"Aziz", "Berk", "Elvin" , "Otgontungalag" , "Parvin" , "Rasim",  "Maria", "Inthira", "Mohammad" , "Bolormaa"};

        for(int i=0; i< friends.length/2; i++) {
            String temp = friends[i];
            friends[i] = friends[friends.length - 1 - i];
            friends[friends.length - 1 - i] = temp;
        }
        System.out.println(Arrays.toString(friends));

        // Alternative longer way.
        String altFriends[] = new String[friends.length-1];
        for (int i = altFriends.length-1; i>=0; i--){
            altFriends[i] = friends[friends.length -1-i];
        }
        System.out.println("Alternative array " + Arrays.toString(altFriends));

    }

}
