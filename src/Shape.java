public class Shape {
    String color;
    public void draw(String color){
        this.color = color;
    }
    void print(){
        System.out.println(color);
        System.out.println();
        return;
    }
}
