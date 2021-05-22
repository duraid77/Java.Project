package day23_Strings_whileLoops;

public class SMS {
    public static void main(String[] args) {
        String word = "Sender: [ Nadir ] From Number<2223334444> Message:{Hello, lets code some java}";
        int senderDex = word.indexOf("[");
        int senderEnd = word.indexOf("]");
        System.out.println("Sender is: " + word.substring(senderDex+1 , senderEnd));
        String sender = word.substring(senderDex+1, senderEnd);
        sender = sender.trim();
        System.out.println("sender = " + sender);

        int numDex = word.indexOf("<");
        int numEnd = word.indexOf(">");
        System.out.println("Number is: " + word.substring(numDex+1 , numEnd));

        System.out.println("Message is: " + word.substring(word.indexOf("{")+1 , word.indexOf("}")));
    }
}
