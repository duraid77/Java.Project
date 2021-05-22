package officeHour.march_23;

public class biggestWord {
    public static void main(String[] args) {
        String word1= "jojo";
        String word2= "Durid";
        String word3= "skylinkschool";
        String biggestWordWithA = "";

        if(word1.contains("a") && word1.length() > biggestWordWithA.length()){
            biggestWordWithA = word1;
        }
        if(word2.contains("a") && word2.length()> biggestWordWithA.length()){
            biggestWordWithA = word2;
        }

        if(word3.contains("a") && word3.length() > biggestWordWithA.length()){
            biggestWordWithA = word3;
        }
        if (!biggestWordWithA.isEmpty()){
            System.out.println("biggestWordWithA = " + biggestWordWithA);
        }else{
            System.out.println("no word with an a");
        }
    }
}
