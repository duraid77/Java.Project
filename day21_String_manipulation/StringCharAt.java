package day21_String_manipulation;
import java.util.Scanner;
public class StringCharAt {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a word or sentence");
        String word = scan.nextLine();
        int length = word.length();
        int i;
        for (i=0; i < length; i++) {
            System.out.println(word.charAt(i));
        }

         String company = "Cybertek";
            System.out.println(company.charAt(0));
            char first = company.charAt(0);
       // System.out.println("first = " + first);
        char second = company.charAt(1);
       // System.out.println("second = " + second);
        char thrid = company.charAt(2);
        char forth = company.charAt(3);
        char fifth = company.charAt(4);
        char sixth = company.charAt(5);
        char seventh = company.charAt(6);
        char eighth = company.charAt(7);
        System.out.println(first + " " + second + " " + thrid + " " + forth
                + " " + fifth + " " + sixth + " " + seventh + " " + eighth);

        //check first and last letters are the same






    }
}
