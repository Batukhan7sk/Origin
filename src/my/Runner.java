package my;

public class Runner {
    public static void main(String[] args) {
        Printable_new [] printables = new Printable_new[6];
        printables[0] = new Magazine_new("Esqure");
        printables[1] = new Magazine_new("Java news");
        printables[3] = new Book_new("45");
        printables[4] = new Book_new("1984");
        printables[5] = new Book_new("My name is Qozha");
        Magazine_new.printMagazines(printables);
        Book_new.printBooks(printables);
    }
}
