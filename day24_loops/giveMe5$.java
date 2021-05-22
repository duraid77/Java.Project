package day24_loops;
import java.util.Scanner;
public class giveMe5$ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me $5: ");
        int dollar = scan.nextInt();
        while (dollar != 5){
            System.out.println("Give me $5");
            dollar = scan.nextInt();
            }
        System.out.println("Thanks for the $5");
        }

    }

