package day50_inheritance;

public class BookObjects {
    public static void main(String[] args) {
        Book book = new Book();
        book.title = "Java is Fun";
        book.author = "Murodil";
        book.price = 12.99;
        book.type = "Programming";
        System.out.println(book.toString());


        AudioBook audiobook = new AudioBook();
        audiobook.title = "Selenium";
        audiobook.author = "Gurhan";
        audiobook.listen();

    }
}
