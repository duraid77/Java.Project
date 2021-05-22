package day13_conditional_statements;
import java.util.Scanner;
public class ATMPincodeProgram {
    public static void main(String[] args) {
        System.out.println("***** WELCOME TO TD BNK ATM *****");
        Scanner scan = new Scanner(System.in);
        int secretPincode = 2233;
        int inputPincode = scan.nextInt();

        if(secretPincode == inputPincode){
            System.out.println("Welcome to your account!");
            System.out.println("You can withdraw, check your balance, and other services");

        }else{
            System.out.println("Incorrect Pin Number");
        }

        System.out.println("Thank you for banking with us!");
    }
}
