package day38_methods;

public class StringUtilTest {
    public static void main(String[] args) {
        String name= "anna";
        if(StringUtilis.isNullOrEmpty(name)){
            System.out.println("Name can not be blank or empty");
        }else{
            System.out.println("name is " + name);
        }
        System.out.println("isPalidrome(name) = " + isPalidrome(name));

    }

    public static boolean isPalidrome(String word){
        for(int i =0; i< word.length()/2; i++){

            if(word.charAt(i) != word.charAt(word.length() - 1 - i) ){
                return false;
            }
        }
        return true;
    }
}
