package day51_inheritance;

public class Employee {
    String jobTitle;


    public double calculateSalary(double hourlyRate){
        double annualSalary = hourlyRate * 8 * 5 * 52;
        annualSalary *= 1.1; // plus 10% bonus
        return annualSalary;
    }
}
