package Questao3T;

public class Parallelogram extends Quadrilateral {
    private double Base;
    private double Altura;

    Parallelogram(Point A, Point B, Point C, Point D, double Base, double Altura) {
        super(A, B, C, D);

        this.Base = Base;
        this.Altura = Altura;
    }

    @Override
    double Area() {
        return Base * Altura;
    }

    @Override
    void exibir(){
        System.out.println("Paralelogramo - base: " + Base + ", altura: " + Altura + ", área: " + Area());
    }
}
