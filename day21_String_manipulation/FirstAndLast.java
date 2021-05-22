package day21_String_manipulation;

public class FirstAndLast {
    public static void main(String[] args) {
        String word = "mom";
        if(word.charAt(0) == word.charAt(word.length() - 1)){
            System.out.println(word.charAt(0) + " " + word.charAt(word.length() - 1));
        }
    }
}
