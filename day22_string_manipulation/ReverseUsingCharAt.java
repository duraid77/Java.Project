package day22_string_manipulation;

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "hoah";
        System.out.println(""+ word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0));
        if(word.charAt(3) == word.charAt(0) && word.charAt(2) == word.charAt(1)){
            System.out.println("word is Palindrome  ");
        }else{
            System.out.println("word is not palindrome");
        }

        //or another way
        String wordReverse = ""+ word.charAt(3) + word.charAt(2) + word.charAt(1) + word.charAt(0);
        if (word.equalsIgnoreCase(wordReverse)){
            System.out.println("word is Palindrome  ");
        }else{
            System.out.println("word is not palindrome");
        }

    }
}
