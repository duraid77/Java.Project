package day09_scanner_practice;
import java.util.Scanner;
public class addNumbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Enter number 2: ");
        int num2 =  scan.nextInt();
        int sum = num1 + num2;

        System.out.println("Total: " + sum);


    }
}
