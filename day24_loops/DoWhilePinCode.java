package day24_loops;

import java.util.Scanner;

public class DoWhilePinCode {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int SecretePinCode = 1234;
        int pinCode;
        int i = 5;
        do {
            System.out.println("Enter pin code");
            pinCode = scan.nextInt();
            if (pinCode == SecretePinCode) {
                System.out.println("Welcome to your account");
            }
            i--;
        } while (pinCode != SecretePinCode && i > 0);
        if (i == 0 && pinCode != SecretePinCode) {
            System.out.println("You have entered wrong pin code more than 5 times. please call your bank");
        }
    }
}
