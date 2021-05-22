package day26_loops;

public class count {
    public static void main(String[] args) {
        String word = "I beleive I can fly. I believe I can touch the sky";
        char letter = 'i';
        int count = 0;
        for (int i = 0 ; i< word.length(); i++){
            if(word.toLowerCase().charAt(i) == letter){
                count++;
            }

        }
        System.out.println("The number of letter" + letter + "is " + count );
    }
}
