package day09_scanner_practice;
import java.util.Scanner;
public class salary_scanner_practice {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int hrsPerWeek = 40;
        System.out.print("What's the hourly rate? ");
        double hourlyRate = scan.nextDouble();
        double weeklySalary = hrsPerWeek * hourlyRate;
        double monthlySalary = weeklySalary * (52/12);
        double annualSalary = weeklySalary* 52;
        System.out.println("weeklySalary = " + weeklySalary);
        System.out.println("monthlySalary = " + monthlySalary);
        System.out.println("annualSalary = " + annualSalary);



    }
}
