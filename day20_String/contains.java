package day20_String;

public class contains {
    public static void main(String[] args){
        String company = "Capital one";
        System.out.println(company.contains("one"));
        System.out.println(company.contains("ital")); //true
        System.out.println(company.contains("l o")); // true

        if(company.contains(" ")){
            System.out.println("Multiple words");
        } else {
            System.out.println("one word");
        }
        String etsyTitle = "Wooden spoon | Etsy";
        if (etsyTitle.contains(" | ")) {
            System.out.println("Pass title check");
        } else {
            System.out.println("Failed title check");
        }
        String name = "Ahmed";
        if (name.contains("A") && name.contains("e")) {
            System.out.println("name contains a and e");
        }

        if (name.contains("A") || name.contains("i")) {
            System.out.println("name contains a or i");
        }
        String email = "Duraid77@yahoo.com";
        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Valid email ");
        } else {
            System.out.println("Invalid email");
        }

        if(email.toLowerCase().contains("d")){
            System.out.println("It contains D");
        }

    }
}
