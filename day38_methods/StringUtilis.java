package day38_methods;

public class StringUtilis {
    public static void main(String[] args) {
       String str = " ";
        System.out.println(isNullOrEmpty(str));
    }


    public static boolean isNullOrEmpty(String word){
        if(word == null || word.isEmpty()){
            return true;
        }
        return false;
    }
}
