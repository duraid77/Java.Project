package day18_conditions_practice_String;

public class IfWithoutCurly {
    public static void main(String[] args) {


        String todayClass = "Tuesday";
        if (todayClass.equals("monday")) {
            System.out.println("Today is Monday");
        }else if(todayClass.equals("Tuesday"))
            System.out.println("todayClass = " + todayClass);

        System.out.println("Hello World");
    }
}
