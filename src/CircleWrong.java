public class CircleWrong {
    int radius;
    int diam;
}
class CircleWrongDemo {
    public static void main(String[] args) {
        CircleWrong circle = new CircleWrong();
        circle.diam = 25;
        circle.radius = 10;
        System.out.println("Diametr" + circle.diam);
        System.out.println("Radius" + circle.radius);
    }
}

