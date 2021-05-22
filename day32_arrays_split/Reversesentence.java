package day32_arrays_split;

public class Reversesentence {
    public static void main(String[] args) {
        String sentence = "I believe I can fly. I believe I can touch the sky";
        String[] senArray = sentence.split(" ");
        String rev = "";
        for(int i= senArray.length-1; i>=0; i--){
            rev += senArray[i] +" ";
        }
        System.out.println("revise = " + rev);
    }
}
