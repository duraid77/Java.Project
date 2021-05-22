package day39_wrapper_class;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10,5));
        System.out.println(Integer.sum(234,566));
        System.out.println(Integer.min(23,5));
        System.out.println(Integer.MIN_VALUE);
        System.out.println("Max int value =" + Integer.MAX_VALUE);

        System.out.println(Double.max(132.4, 54.0));
        System.out.println(Double.min(134.4, 42.8));
        System.out.println("min double value" + Double.MIN_VALUE);
        System.out.println(("max double value " + Double.MAX_VALUE));

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('f'));
        System.out.println(Character.isAlphabetic('r'));
        System.out.println(Character.isLetter('t'));
        System.out.println(Character.isUpperCase('h'));
        System.out.println(Character.isLowerCase('r'));

        char letter = 'A';
        if(Character.isUpperCase(letter)){
            System.out.println("it is upper case");
        }

        String word = "JaVa is FuN";
        for (int i = 0; i < word.length(); i++) {
            if(Character.isUpperCase(word.charAt(i))){
                System.out.print(word.charAt(i) + " ");
            }else if(Character.isLowerCase(word.charAt(i))){
                continue;
            }

        }

        System.out.println(Character.MIN_VALUE);
        System.out.println(Character.MAX_VALUE);
        
        
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("(count + 1) = " + (count + 1));
        
        
        
    }
}
