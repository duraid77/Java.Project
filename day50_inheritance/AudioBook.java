package day50_inheritance;

public class AudioBook extends Book{
    int length;
    String narrator;

    public void listen(){
        System.out.println("Listen to Audio Book");
        System.out.println("narrator is " + narrator);
        System.out.println("book's length is " + length);
        System.out.println("Book's name " + title);

    }
}
