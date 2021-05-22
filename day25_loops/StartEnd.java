package day25_loops;
import java.util.Scanner;
public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int start = 0;
        int end;
        System.out.println("Enter Start");
        start = scan.nextInt();
        System.out.println("Enter End");
        end = scan.nextInt();

        if (start > end){
            System.out.println("reverse numbering is not supported");
        }else{
            for( start = start; start<=end; start++){
                System.out.print(start +" ");
            }
        }
    }
}
