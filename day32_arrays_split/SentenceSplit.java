package day32_arrays_split;

public class SentenceSplit {
    public static void main(String[] args) {
        String sentence = "Java is fun";

        System.out.println("The length of the sentence is " + sentence.split(" ").length);

        String words[] = sentence.split(" ");
        for(String each: words){
            System.out.println("each word = " + each);
        }

        String googleResult = "About 1,810,000 results (0.68 seconds)";
        String [] resultArray = googleResult.split(" ");

        System.out.println("Count of search = " + resultArray[1]);
        System.out.println("Count the seconds " + resultArray[3].replace("(" , ""));

    }
}
