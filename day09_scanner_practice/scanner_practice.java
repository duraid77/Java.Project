package day09_scanner_practice;
import java.util.Scanner;

public class scanner_practice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your first name? ");
        String fstName = scan.next();
        System.out.print("What is your last name? ");
        String lastName = scan.next();
        System.out.print("How old are you? ");
        int age = scan.nextInt();
        System.out.print("Are you an Engineer? ");
        boolean isEngineer = scan.nextBoolean();

        System.out.println("Hello " + fstName + " " + lastName + " You are " + age + ". Are you an engineer? " + isEngineer);




    }
}
