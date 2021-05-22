package day18_conditions_practice_String;
import java.util.Scanner;
public class MultiBranchIf {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scan.nextInt();
        if (number > 0){
            System.out.println("Number is positive");
        }else if(number < 0){
            System.out.println("Number is negative");
        }else
            System.out.println("Zero");

    }
}
