package day51_inheritance;

public class EmployeeObject {
    public static void main(String[] args) {
        Employee developer = new Employee();
        System.out.println(developer.calculateSalary(55));
        double annualDevSalary = developer.calculateSalary(60);
        System.out.println("annualDevSalary = " + Math.round(annualDevSalary));
        developer.jobTitle = "Developer";
        Contractor sdetContractor = new Contractor();
        double sdetSalary = sdetContractor.calculateSalary(55);
        System.out.println("sdetSalary = " + sdetSalary);
        sdetContractor.jobTitle= "SDET";

        System.out.println(developer.toString());
        System.out.println(sdetContractor);
    }
}
