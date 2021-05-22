package day08_casting_scanner;

import java.util.Scanner;

public class scannerPractice {
    public static void main(String[] args) {
        Scanner name = new Scanner(System.in);
        System.out.println("Please tell me your name");
        String yourName = name.next();

        System.out.println("Hello " + yourName  + ", nice to meet you");
    }

}
