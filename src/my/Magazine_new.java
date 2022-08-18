package my;

public class Magazine_new implements Printable_new {
    String name;
    @Override
    public String getName() {
        return name;
    }

    public Magazine_new(String name) {
        this.name = name;
    }

    public static void printMagazines(Printable_new[] printables) {
        for (Printable_new p:printables) {
            if (p instanceof Magazine_new) {
                System.out.println("Magazine name is =" + p.getName());
            }
        }
    }

}
