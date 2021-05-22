package day37_methods_overloading;

public class LoginNegativeTest {
    public static void main(String[] args) {
        String username = "cybertekstudent";
        String password = "abc13";

        String result = login(username, password);
        System.out.println("result = " + result);

    }
    public static String login(String user, String password){
        String Secretusername = "cybertekstudent";
        String Secretpassword = "abc123";
        if (!user.equalsIgnoreCase(Secretusername)){
            return "invalid username";
        }else if(!password.equals(Secretpassword)){
            return "incorrect password";
        }else{
            return "login successful";
        }
    }
}
