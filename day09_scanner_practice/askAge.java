package day09_scanner_practice;
import java.util.Scanner;

public class askAge {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How old are you? ");
        int age= scan.nextInt();

        System.out.print("What's your name? ");
        String name = scan.next();
        System.out.println("Hello " + name + " You are " + age + " years old");

    }
}
