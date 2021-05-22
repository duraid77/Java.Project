package day22_string_manipulation;

public class DynamicSubstring {
    public static void main(String[] args) {
        String result = "result count:12345";
        int location = result.indexOf("12345");
        System.out.println(result.substring(location));
        System.out.println((result.substring(result.indexOf("1"))));
        // or
        System.out.println(result.substring(result.indexOf(":") +1));

        String today = "i learned [java] today";
        int firstind = today.indexOf("[");
        int secInd = today.indexOf("]");
        System.out.println(today.substring(today.indexOf("[") + 1, today.indexOf("]")));

    }
}
