package day24_loops;

import java.util.*;

public class guessNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomNum = new Random();
        int SecretNumber = randomNum.nextInt(101);
        int gussingNumber;
        int counter = 0;
        do{
            System.out.println("Guess the secret number");
            gussingNumber = scan.nextInt();
            if(gussingNumber> SecretNumber){
                System.out.println("Too Large");
            }else if(gussingNumber< SecretNumber){
                System.out.println("Too Small");
            }
            counter++;
        }while (SecretNumber != gussingNumber);
        System.out.println("Congratulations! you have guessed the secrete number it is: " + gussingNumber);
        System.out.println("You have found the secret number in :" + counter + " tries");
    }

}
