package day08_casting_scanner;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class anotherScanner {
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
        Scanner years = new Scanner(System.in);
        Scanner city = new Scanner(System.in);
        Scanner country = new Scanner(System.in);

        System.out.print("How old are you?");

        int yourAge = value.nextInt();

        System.out.println("yourAge = " + yourAge + ". You are too old");

        System.out.print("How many years have you live here?");
        int yearsInResidence = years.nextInt();

        System.out.print("What city do you live at?");
        String cityOfResidence = city.next();

        System.out.print("What country?");
        String countryOfResidence = country.next();

        System.out.println("You are " + yourAge + ". You live in " + countryOfResidence  + ". Your city is " + cityOfResidence + " city ");







    }
}
