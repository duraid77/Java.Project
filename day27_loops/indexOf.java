package day27_loops;

public class indexOf {
    public static void main(String[] args) {
        String word = "github";
        char letter = 'i';
        int index = -1;
        for (int n=0; n<word.length(); n++){
            if(word.charAt(n) == letter){
                index = n;
                break;
            }
        }
        if(index!= -1){
            System.out.println("Letter " + letter + " was found at index " + index);
        }else{
            System.out.println("Letter " + letter + "was not found");
        }

    }
}
