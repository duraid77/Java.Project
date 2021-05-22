public class loginTest {
    public static void main(String[] args){
        String expUserName = "cybertek";
        String expPassword = "Abc123";
        String username = "CyberTek";
        String password = "Abc123";

        if (username.equalsIgnoreCase(expUserName)){
            if(password.equals(expPassword)){
                System.out.println("login successful");
            }else{
                System.out.println("incorrect password");
            }
        }else{
            System.out.println("incorrect username");
        }

    }
}
