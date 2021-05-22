package day39_wrapper_class;

public class ParseString {
    public static void main(String[] args) {
        String total = "345";
        int count = Integer.parseInt(total);
        System.out.println("count = " + count);

        String strPrice = "8.99";
        Double price = Double.parseDouble(strPrice);
        System.out.println("price = " + price);

        String sentence = "We wrote 100 lines of java code";
        String[] str = sentence.split(" ");

        int num = Integer.parseInt(str[2]);
        System.out.println("num = " + num);

        }
    }

