import java.util.Formatter;

public class strok {
    public static void main(String[] args) {
        Formatter f = new Formatter();
        f.format("This %s is about %n%S %c", "book", "java", '9');
        System.out.print(f);
    }
}
