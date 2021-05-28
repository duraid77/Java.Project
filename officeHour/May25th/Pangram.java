package officeHour.May25th;

import java.util.Locale;

public class Pangram {
    public static void main(String[] args) {

       String sentence = "Hello How are you";
       boolean check = true;
        for(char letter = 'a'; letter<='z'; letter++){
            if(!sentence.toLowerCase().contains("" + letter)){
                check = false;
                break;
            }
        }
    }
}
