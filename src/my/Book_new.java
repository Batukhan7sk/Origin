package my;

public class Book_new implements Printable_new {
    String bookName;
    @Override
    public String getName() {
        return bookName;
    }

    public Book_new(String bookName) {
        this.bookName = bookName;
    }

    public static void printBooks(Printable_new[] printables) {
        for (Printable_new p:printables) {
            if (p instanceof Book_new) {
                System.out.println("Book name =" +p.getName());
            }
        }
    }
}
