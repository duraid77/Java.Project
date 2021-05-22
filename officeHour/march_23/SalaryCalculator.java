package officeHour.march_23;

import java.util.*;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double hourlyRate;
        int weeklyHours, numberOfWeeks;
        System.out.println("Enter hourly rate");
        hourlyRate = scan.nextDouble();
        System.out.println("Enter weekly hours");
        weeklyHours = scan.nextInt();
        System.out.println("Enter number of weeks");
        numberOfWeeks = scan.nextInt();

        if (hourlyRate > 0) {
            if (weeklyHours > 0 && weeklyHours <= 65) {
                if (numberOfWeeks > 0 && numberOfWeeks <= 52) {
                    double salary = hourlyRate * weeklyHours * numberOfWeeks;
                    System.out.println("salary = " + salary);
                } else {
                    System.out.println("Invalid number of weeks");
                }
            } else {
                System.out.println("Weekly Hours invalid");
            }
        } else {
            System.out.println("Invalid Hourly rate");
        }


    }
}
