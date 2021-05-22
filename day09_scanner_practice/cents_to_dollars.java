package day09_scanner_practice;
import java.util.Scanner;

public class cents_to_dollars {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value in cents ");
    int cents = scan.nextInt();
      //  int dollars = cents /100;
        int remainder = cents % 100;
        System.out.println("remainder = " + remainder);
    }
}
