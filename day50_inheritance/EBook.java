package day50_inheritance;

public class EBook extends Book{
    double size;
    int pages;
    public void readBook(){
        System.out.println("Reading book " + title);
        System.out.println("Author " + author);
        System.out.println("size " + size);
        System.out.println("Number of pages " + pages);
    }
}
