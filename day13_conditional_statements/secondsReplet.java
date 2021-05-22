package day13_conditional_statements;
import java.util.Scanner;
public class secondsReplet {
    public static void main(String[] args) {
        //YOUR CODE HERE:
        Scanner scan = new Scanner(System.in);

        int inputSecond;
        int hours;
        int minutes;
        System.out.println("Enter seconds");
        inputSecond = scan.nextInt();
        hours = inputSecond /3600;
        inputSecond %= hours;
        minutes = inputSecond/60;
        inputSecond %= minutes;

        System.out.println(hours + " hours, " + minutes + " minutes, " + "and " + inputSecond + " seconds");

    }
}
