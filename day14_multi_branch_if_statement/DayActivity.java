package day14_multi_branch_if_statement;
import java.util.Scanner;
public class DayActivity {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How is the weather today?");
        String weather = scan.next();

        if (weather.equals("sunny")){
            System.out.println("go to the park");
            System.out.println("go to the beach");
        }else if (weather.equals("rainy")){
            System.out.println("Stay home and watch TV");
        }else if (weather.equals("snowy")){
            System.out.println("Take the kids out to play");
        }else if (weather.equals("windy")){
            System.out.println("Do some dragon raids");

        }else{
            System.out.println("Just code java");
        }



    }
}
