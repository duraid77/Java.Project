package officeHour.mayFifth;

import java.util.Arrays;

public class ReverseOnlyLetters {
    public static void main(String[] args) {
        String str = "----qwe--r--tyf...gd.---";
        char [] letters = str.toCharArray();
        System.out.println("letters = " + Arrays.toString(letters));
        // [-, -, -, -, q, w, e, -, -, r, -, -, t, y, f, ., ., ., g, d, ., -, -, -]
        // [-, -, -, -, d, g, f, -, -, y, -, -, t, r, e, ., ., ., w, q, ., -, -, -]
        int ending = letters.length; // an indicator to show where the inner loop starts.
        for(int i = 0; i< letters.length; i++){
            if(!Character.isLetter(letters[i])){
                continue;
            }
            if(ending <=i){
                break;
            }
                        for(int j = ending -1; j>i; j--){
                if(Character.isLetter(letters[j])){
                    char temp = letters[i];
                    letters[i] = letters[j];
                    letters[j] = temp;
                    ending = j;
                    break;
                }
                ending = j;
            }
        }
        System.out.println("Arrays.toString(letters) = " + Arrays.toString(letters));

    }
}
