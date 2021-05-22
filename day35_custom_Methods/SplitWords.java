package day35_custom_Methods;
import java.util.*;
public class SplitWords {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        String str = scan.nextLine();
        MakeArray(str);


    }

    public static void MakeArray(String str){
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
    }
}
