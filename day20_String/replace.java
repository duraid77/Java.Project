package day20_String;

public class replace {
    public static void main(String[] args) {
        String word = "java";
        String newWord = word.replace("a", "u");
        System.out.println("word = " + newWord);

        String sentence = "Java Strings are fun";
        System.out.println(sentence.replace("Strings", "conditions"));
        System.out.println(sentence.replace("Java ",""));
    }
}
