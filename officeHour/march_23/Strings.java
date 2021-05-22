package officeHour.march_23;
import java.util.*;
public class Strings {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //check if char is upper case or lower case
        System.out.println("Enter single letter");
        char letter = scan.next().charAt(0);
        if(letter >= 'A' && letter <= 'Z'){
            System.out.println("Upper case");
        }else if(letter>= 'a' && letter <= 'z'){
            System.out.println("lower case");
        }else
            System.out.println("Not a valid letterS");

    }
}
