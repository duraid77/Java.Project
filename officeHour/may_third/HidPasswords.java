package officeHour.may_third;

import java.util.ArrayList;

public class HidPasswords {
    public static void main(String[] args) {
        String[] passwords = {"apple", "java", "tree", "cat", "animal", "shortcut"};
        ArrayList<String> hiddenPassword = new ArrayList<>();

        for(String each: passwords){
            hiddenPassword.add(convertToStars(each));
        }
        System.out.println(hiddenPassword);
    }

    public static String convertToStars(String word){
        String password = "";
        for (int i = 0; i < word.length(); i++) {
            password +="*";
        }
        return password;
    }
}
