package officeHour;
import java.util.Locale;
import java.util.Scanner;
public class StringPractice2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first word");
        String word1 = scan.next();
        System.out.println("Enter second word");
        String word2 = scan.next();

        int last = word2.length()-1;

        System.out.println(word1.substring(1));
        System.out.println(word2.substring(0, word2.length()-1));

       /**
        System.out.println("Enter word to find middle");
        String word = scan.next();
        int length = word.length();
        int middle;
        middle = length/2;
        if (length %2 == 0){

            System.out.println(word.substring(middle-1, middle+1));


            }else{
            System.out.println(word.substring(middle ,middle+1));
        }
        */
       // initials
        System.out.println("" + word1.toUpperCase().charAt(0) + word2.toUpperCase().charAt(0));

        // moving first word from a sentence to the end. sentence is "Java is fun"
        scan.nextLine();
        System.out.println("Enter a sentence");
        String sentence = scan.nextLine();
        int space = sentence.indexOf(" ");
        String NewSentence = "RasimDuraidParvin";

        if(NewSentence.contains("Duraid")){
            System.out.println();

        }





        int firstBlank = sentence.indexOf(" ");

        System.out.println(sentence.substring(firstBlank+1) + " " + sentence.substring(0, firstBlank));


    }
}
