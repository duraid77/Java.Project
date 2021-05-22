package day45_oop;

public class ComparingStrings {
    public static void main(String[] args) {
        String word1 = "java" ; //in string pool
        String word2 = "java" ; // re-use from string pool word1 == word2
        String word3 = new String("java"); // create in HEAP a new object outside the pool
        String word4 = new String(("java"));

        System.out.println(word1 == word2);
        System.out.println(word1 == word3);

        System.out.println(word1.equals(word3));
        System.out.println(word3.equals(word4));
    }
}
