package day51_inheritance;

public class Contractor extends Employee{


    @Override
    public double calculateSalary(double hourlyRate) {
        double annualSalary = hourlyRate * 8 * 5 * 50;

        return annualSalary;
    }

    @Override
    public String toString() {
        return "Contractor{" +
                "jobTitle='" + jobTitle + '\'' +
                '}';
    }
}
