package day32_arrays_split;

import java.util.Arrays;

public class SplitMethod {
    public static void main(String[] args) {
     String words = "java,python,selenium,html";
     String[] wordsArray = words.split(",");
        System.out.println(Arrays.toString(wordsArray));

        String sentence = "Today I am coding java arrays";
        String[] sentenceArray = sentence.split(" ");
        System.out.println("There are " + sentenceArray.length + " in the sentence. ");

        System.out.println(Arrays.toString(sentenceArray));


        for(String each: sentenceArray){
            System.out.println("each = " + each);
        }



    }
}
