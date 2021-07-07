package day60_exceptions;

import java.util.Locale;

public class StringIndexIssue {
    public static void main(String[] args) {
        String word = "java";
        try {
            System.out.println("word = " + word);
            System.out.println(word.charAt(10));
        } catch (Exception e) {
            System.out.println("exception found and handled");
            System.out.println("reason is = " + e.getMessage());
            System.out.println(e.getClass().getSimpleName());

        }
        System.out.println(word.toUpperCase());

        String word2 = "selenium";
        try {
            System.out.println("word2 = " + word2);
            System.out.println(word2.substring(0, 5));
            System.out.println(word2.substring(0, 15));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Out of bound exception was found and resolved");
            System.out.println("Reason is " + e.getMessage());
            System.out.println("Type of exception = " + e.getClass().getSimpleName());
        }

    }
}
