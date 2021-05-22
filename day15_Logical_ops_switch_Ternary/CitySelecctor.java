package day15_Logical_ops_switch_Ternary;

public class CitySelecctor {
    public static void main(String[] args) {
        String city = "Miami";
        if(city.equals("Miami") || city.equals("LA")){
            System.out.println("Consider the offer and move there");
        }else{
            System.out.println("Reject the offer");
        }
        String teacher = "Murodil";

        if(teacher.equals("Murodil") || teacher.equals("Saim")){
            System.out.println("It's java class with " + teacher);
        }else if(teacher.equals("Nadir")) {
            System.out.println("Soft skill class with " + teacher);
        }else{
            System.out.println("I don't know this teacher");
        }




    }
}
