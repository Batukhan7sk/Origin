public class Rectangle extends Figure {
    public Rectangle(double dim1, double dim2){
        super(dim1,dim2);
    }
    public double area(){
        System.out.println("V oblasti chetireugolnika");
        return dim1 * dim2;
    }
}
