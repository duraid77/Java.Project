package day08_casting_scanner;

import java.util.Scanner;

public class scannerIntro {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter your name: ");

        String firstName = scan.next();

        System.out.println("nice to meet you, " + firstName);


    }
}
