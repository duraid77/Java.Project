package day09_scanner_practice;
import java.util.Scanner;
public class speed_check {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte speedLimit = 55;
        System.out.print("Whats your current speed? ");
        byte currentSpeed = scan.nextByte();
     System.out.println("You are driving " + (currentSpeed - speedLimit) + " over speed limit.");


    }
}
