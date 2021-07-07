package day60_exceptions;

public class MultiCatchBlock {
    public static void main(String[] args) {
        String word = "java";
        String word2 = null;

        try {
            System.out.println(10/0);
            System.out.println("word2 " + word2);
            System.out.println(word2.length());
            System.out.println(word2.substring(20));
        }catch (NullPointerException e){
            System.out.println("NullPointerException was found and handled, please check if string has a value");
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("Index is wrong, please check if you entered a valid index");
        }catch (Throwable t){
            System.out.println("Exception is caught");
            System.out.println("Reason is " + t.getLocalizedMessage());
        }


    }
}
