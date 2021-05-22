package day31_arrays;

public class CharArray {
    public static void main(String[] args) {
        char[] letters = {'j', 'a', 'v', 'a', ' ', 'i', 's', ' ', 'f', 'u', 'n'};
        for(char each: letters){
            System.out.print(each);
        }
        System.out.println();
        String sentence = new String(letters);
        System.out.println("sentence = " + sentence);


        // converting sentence to array
        String item = "wooden spoon";
        char[] itemArray = item.toCharArray();
        for(char each : itemArray) {
            System.out.println(each);

        }
            String[] fruits = {"bananas" , "apples" , "kiwi", "mango" , "papaya" , "strawberry"};
        System.out.println(String.join("-", fruits));

        for(String str: fruits){
                System.out.print(str +"-");
            }
        }
    }

