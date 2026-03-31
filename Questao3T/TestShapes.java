package Questao3T;

public class TestShapes {
    public static void main(String[] args){

        Trapezoid trapezoid = new Trapezoid( new Point(0, 0), new Point(8, 0), new Point(6, 4), new Point(2, 4), 8, 4, 4);
        trapezoid.exibir();

        Parallelogram parallelogram= new Parallelogram( new Point(0, 0), new Point(6, 0), new Point(8, 4), new Point(2, 4),  6, 4);
        parallelogram.exibir();

        Rectangle rectangle = new Rectangle(new Point(0, 0), new Point(5, 0), new Point(5, 3), new Point(0, 3), 5, 3);
        rectangle.exibir();

        Square square = new Square(new Point(0,0), new Point(4, 0), new Point(4, 4), new Point(0, 4), 4);
        square.exibir();

    }
}
