package day28_loops;


/**
 * Given a string retrieve and print only unique characters
 */

public class interviewPractice {
    public static void main(String[] args) {
        String word = "javva";
        String unique = "";

        for (int i = 0; i < word.length(); i++) {
            //if word.charAt(i) is not contains in unique
            //add to unique
            if (!unique.contains(word.charAt(i) + "")) {
                unique += word.charAt(i);
            }
        }

        System.out.println(unique);
    }
}



//
//public class interviewPractice {
//    public static void main(String[] args) {
//        String sentence = "Hello world";
//        for (int i = 0; i < sentence.length(); i++) {
//                String sentenceWithoutChar = sentence.substring(0, i) + sentence.substring(i + 1);
//                if (!sentenceWithoutChar.contains("" + sentence.charAt(i))) {
//                    System.out.println("letter " + sentence.charAt(i) + " is unique");
//                }
//
//        }
//    }
//}
//


