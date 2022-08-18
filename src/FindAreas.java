public class FindAreas{
    public static void main(String[] args) {
        Figure[] figures = new Figure[3];
        figures[0] = new Figure(15,15);
        figures[1] = new Figure(13,13);
        figures[2] = new Figure(9,9);
        for (Figure figure: figures){
            figure.area();
        }
    }
}

class Triangle extends Figure{
    public Triangle(double dim1, double dim2){
        super(dim1, dim2);
    }
    public double area(){
        System.out.println("V oblasti triugolnika");
        return dim1 * dim2 / 2;
    }
}