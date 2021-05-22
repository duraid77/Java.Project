package day09_scanner_practice;
import java.util.Scanner;
public class grocery_shopping {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter price for milk ");
        double milk = scan.nextDouble();
        System.out.println("Enter price for bread ");
        double bread = scan.nextDouble();
        System.out.println("Enter price for cucumbers ");
        double cucumbers = scan.nextDouble();

        double total = milk + bread + cucumbers;
        System.out.println("total = " + total);

    }


}
