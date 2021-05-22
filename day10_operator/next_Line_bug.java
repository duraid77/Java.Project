package day10_operator;
import java.util.Scanner;
public class next_Line_bug {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your rent value: ");
        double rent = scan.nextDouble();
        System.out.print("Enter the month");
        scan.nextLine();
        String month = scan.nextLine();

        System.out.println("Your rent is $" + rent + " for the month of " + month);
    }
}
