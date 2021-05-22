package officeHour.may_third;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetters {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>(Arrays.asList("java", "html", "javascript",
                "java", "word", "java"));
        char targetLetter = 'a';
        int count =0;
        for (String word : words) {

            for (int i = 0; i < word.length(); i++) {
                if(word.charAt(i) == targetLetter){
                    count++;
                }

            }

        }
        System.out.println("count = " + count);
    }
}
