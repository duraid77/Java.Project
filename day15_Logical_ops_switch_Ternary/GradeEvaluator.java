package day15_Logical_ops_switch_Ternary;
import java.util.Scanner;
public class GradeEvaluator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please input Grade: ");
        char grade = scan.nextLine().charAt(0);

        if(grade == 'A' || grade == 'B' || grade == 'C'){
            System.out.println("Passed with grade: " + grade);

        }else if (grade == 'D'){
            System.out.println("Qualify for retake");
        }else if (grade == 'E'){
            System.out.println("You have failed");
        }else{
            System.out.println("Not a valid entry");
        }
    }
}
