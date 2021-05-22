package day10_operator;
import java.util.Scanner;
public class change_VariableValue {
    public static void main(String[] args)    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter value please:  ");
        double count = scan.nextDouble();
        count = count + 2;
        System.out.println("count = " + count);

    }
}
