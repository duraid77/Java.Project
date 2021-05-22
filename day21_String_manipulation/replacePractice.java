package day21_String_manipulation;

public class replacePractice {
    public static void main(String[] args){
        String word = "github";
        System.out.println(word.toUpperCase());
        System.out.println(word.replace("git" , "lab"));
        word = word.replace("hub" , "lab");
        System.out.println("word = " + word);
        // i to o and a to i
        System.out.println(word.replace('i' , 'o').replace('a','i'));

        String sentence = "java is fun";
        String withoutSpace = sentence.replace(" ", "");
        System.out.println("withoutSpace = " + withoutSpace);
        String selenium = withoutSpace.replace("java", "Selenium").replace("fun","a lot of fun");
        System.out.println("selenium = " + selenium);
        selenium = selenium.replace("is", " is ");
        System.out.println("selenium = " + selenium);


        String result = "1-48 of over 4,000 results for \"java book\"";
        result = result.replace("1-48 of over ", "")
                        .replace(" results for \"java book\"", "")
                        .replace(",", "");
        System.out.println("result = " + result);
        int count = Integer.parseInt(result);
        System.out.println("count = " + count);


    }
}
