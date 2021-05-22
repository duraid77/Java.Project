package day43_arraylist_customClass;

public class Employee {
    String fullName;
    String jobTitle;
    public void work(){
        System.out.println(fullName + " works as " + jobTitle);
    }
}
class company{
    public static void main(String[] args){
    Employee employee1 = new Employee();
    employee1.fullName = "Aziz ";
    employee1.jobTitle = "SDET";
    employee1.work();
        System.out.println("employee1 = " + employee1.fullName);
        System.out.println("job title = " + employee1.jobTitle);

        Employee employee2 = new Employee();
        employee2.fullName = "Saim";
        employee2.jobTitle = "Java wizard";
        employee2.work();

        Employee employee3 = new Employee();
        employee3.fullName = "Spark";
        employee3.jobTitle = "Alien";
        employee3.work();
    }

}
