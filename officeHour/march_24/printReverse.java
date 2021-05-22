package officeHour.march_24;
import java.util.Scanner;
public class printReverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word");
        String word = scan.nextLine();
        int i;
        for(i = word.length()-1; i>=0 ; i--){
            System.out.print(word.charAt(i) + " ");
        }
    }

}
