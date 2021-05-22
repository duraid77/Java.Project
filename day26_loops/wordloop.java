package day26_loops;

public class wordloop {
    public static void main(String[] args) {
        String word = "Hello World";
        int i;
        for(i = 0 ; i< word.length(); i++){
            System.out.print(word.charAt(i) + " ");
        }
        System.out.println("");
        for (i = word.length()-1; i >=0; i--){
            System.out.print(word.charAt(i)+ " ");
        }
    }
}
