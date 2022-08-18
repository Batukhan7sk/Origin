public class Box {
    public static void main(String[] args) {
        //ссылка на другой класс
        Tab box = new Tab();
        Bot box1 = new Bot();
        Put box2 = new Put();
        box2.get(99 ,55,1);
        box.width = 10;
        box.depth = 15;
        box.height = 20;
        //выводим метод из другого класса
        System.out.println(box1.Metod());
        System.out.println(box.Metod_Tab());
        System.out.println(box2);

    }
}
