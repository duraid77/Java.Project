package day35_custom_Methods;

public class email {
    public static void main(String[] args) {
        String name = "duraid";
        String domain = "yahoo";
        buildEmail(name, domain);
        buildEmail("John Ward III" , "verizon");
    }
    public static void buildEmail(String name, String domain){

        String email = name.replace(" " , "_") + "@" + domain.toLowerCase() + ".com";
        System.out.println("email = " + email);
    }
}
