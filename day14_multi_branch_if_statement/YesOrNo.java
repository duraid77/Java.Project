package day14_multi_branch_if_statement;
import java.util.Scanner;
public class YesOrNo {
    public static void main(String[] args) {
        System.out.println("Are you sure you want to delete this file?");
        Scanner scan = new Scanner(System.in);
        String del = scan.next();
        boolean answer;
        String result;

        if(del.equals("y")){
            System.out.println("Your file has been deleted");
            answer = true;
            result = "deleted";
        }else if(del.equals("n")){
            System.out.println("Deleting has been cancelled");
            answer = false;
            result = "not deleted";
        }else{
            System.out.println("Not a valid inputn");
            answer = false;
            result = "not deleted";
        }

        System.out.println("Did file get deleted? " + answer);


    }
}
