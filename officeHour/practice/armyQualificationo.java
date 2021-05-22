package officeHour.practice;
import java.util.Scanner;
public class armyQualificationo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("What is your citizenship?");
        String citizenship = scan.next();
        boolean resident = false;

        if (!citizenship.equalsIgnoreCase("USA")) {
            System.out.println("Are you are US resident?");
            resident = scan.nextBoolean();
        }

        if (citizenship.equalsIgnoreCase("usa") || resident) {
            System.out.println("Please Enter your age:");
            int age = scan.nextInt();
            if (age >= 18 && age <= 35) {
                System.out.println("Do you have a high School diploma");
                boolean hasDeploma = scan.nextBoolean();
                if (hasDeploma) {
                    System.out.println("You are qualified for the US aremy");
                } else {
                    System.out.println("You must have a high school deploma");
                }
            } else {
                System.out.println("Your age must be between 18 and 35 years old");
            }
        } else {
            System.out.println("You must be a US citizen or resident to join the US army");
        }


    }
}
