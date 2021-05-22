package officeHour.Practic_03_09;
import java.util.Scanner;
public class practice{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        int inputSeconds, hours, minutes, seconds;
        System.out.println("Enter Seconds");
        inputSeconds = scan.nextInt();
        hours = inputSeconds / 3600;
        inputSeconds = inputSeconds % 3600;
// or inputSeconds %= 3600;

        minutes = inputSeconds / 60;

        inputSeconds %= 60;
        seconds = inputSeconds;

        System.out.println(hours + " Hours " + minutes + " Minutes " + seconds + " Seconds");

    }


}