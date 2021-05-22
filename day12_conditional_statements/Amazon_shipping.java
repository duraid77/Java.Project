package day12_conditional_statements;
import java.util.Scanner;
public class Amazon_shipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Total price: ");
        double TotalPrice = scan.nextDouble();

        if(TotalPrice >= 25){
            System.out.println("TotalPrice = " + TotalPrice);
            System.out.println("Item is eligible for free shipping");
        }else{
            System.out.println("TotalPrice = " + TotalPrice);
            System.out.println("Item is not eligible for free shipping");
        }

    }
}
