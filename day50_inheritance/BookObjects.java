package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Learning Java";
        book.author = "Savitch";
        book.type = "Programming";
        book.price = 85.99;

        EBook eBook = new EBook();
        eBook.author = "unmesh";
        eBook.price = 44.99;
        eBook.title = "Selenium cookbook";
        eBook.type = "Automation";
        eBook.size = 1000;
        eBook.pages = 485;


        AudioBook audioBook = new AudioBook();
        audioBook.author = "unmesh";
        audioBook.length = 60;
        audioBook.narrator = "irina";
        audioBook.price = 44.99;
        audioBook.title = "Selenium cookbook";
        audioBook.type = "Automation";
        audioBook.listen();

    }
}
