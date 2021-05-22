package day37_methods_overloading;

public class MethodPractice {
    public static void main(String[] args) {

      String result =  repeatString( "java", 5, '<');
        System.out.println("result = " + result);
    }
    public static String repeatString(String word, int num, char delimiter){
        String sentence = "";
        for (int i =1; i< num-1; i++){
            sentence += word + delimiter;
        }
        sentence += word;
        return sentence;
    }




}
