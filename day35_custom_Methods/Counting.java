package day35_custom_Methods;
import java.util.*;
public class Counting {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

            System.out.println("Input the number please");
            int num = scan.nextInt();
            count(num);

        String word = "wooden spoon";
        count(word.length());

        printAge(1977);

    }
    public static void count(int nums){
        for (int i = 0; i <= nums; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

    }
    public static void printAge(int year){
        int age = 2021 - year;
        System.out.println("age = " + age);
    }
}
