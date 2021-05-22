package day37_methods_overloading;



public class WarmUpMethod {
    public static void main(String[] args) {
     String username = "cybertekstudent";
     String password = "abc123";
     String result = login(username, password);
    }


    public static String login(String username, String password){
        String secretUserName = "cybertekStudent";
        String secretPassword = "abc123";
        if(username.equalsIgnoreCase(secretUserName) && secretPassword.equals(secretPassword)){
            System.out.println("login successful");
            return "successful";
        }
        System.out.println("login failed");
        return "failed";
    }
}
