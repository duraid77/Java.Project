package day14_multi_branch_if_statement;
import java.util.Scanner;
public class CalculatorV1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number1 and number2");
        double num1 = scan.nextDouble();
        double num2 = scan.nextDouble();
        char operator = scan.next().charAt(0); // yay something new today

        if (operator == '+') {
            System.out.println("sum = " + (num1 + num2));
        } else if (operator == '-') {
            System.out.println("sum = " + (num1 - num2));
        } else if (operator == '*') {
            System.out.println("sum = " + (num1 * num2));
        } else if (operator == '/') {
            System.out.println("sum = " + (num1 / num2));


        }
    }
}
