package day24_loops;
import java.util.Scanner;
public class countUntil {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int count, number;
        count =1;
        System.out.println("Enter loop limit");
        number = scan.nextInt();
        while(count <= number){
            System.out.println("count = " + count);
            count++;
        }
    }
}
