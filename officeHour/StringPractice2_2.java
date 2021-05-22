package officeHour;

public class StringPractice2_2 {
    public static void main(String[] args) {
        String word = "Sender: <James Bond>. From Number: [202-123-3456]. + Message: {I love programming and problem solving}";
/*
Given a String in the following format:
“Sender: <James Bond>. From Number: [202-123-3456]. +
Message: {“I love programming and problem solving}”
Separate these parts and print them separately:
“Sender: actualSender”
“Number: actualNumber”
“Message: actualMessage”
 */

        int senderDex = word.indexOf("<");
        int senderEnd = word.indexOf(">");
        System.out.println(word.substring(senderDex+1 , senderEnd));

        int numDex = word.indexOf("[");
        int numEnd = word.indexOf("]");
        System.out.println(word.substring(numDex+1 , numEnd));

        System.out.println(word.substring(word.indexOf("{")+1 , word.indexOf("}")));

        String sentence1 = "duraid";
        String sentence2 = "Hussein";

        if(sentence1.length()< 6 || sentence2.length()< 6){
            System.out.println("Invalid date");
        }else{
            String email = sentence1.substring(0,4) + sentence2.substring(sentence2.length()-3) +"@cybertek.com";
            System.out.println("email = " + email);
        }

        // assume sencond 6. 012345





















    }
}
