package Questao3T;

public class Trapezoid extends Quadrilateral{
    private double baseMaior;
    private double baseMenor;
    private double Altura;

    public Trapezoid(Point A, Point B, Point C, Point D, double baseMaior, double baseMenor, double Altura){
        super( A, B, C, D);

        this.baseMaior = baseMaior;
        this.baseMenor = baseMenor;
        this.Altura = Altura;

    }

    @Override
    double Area(){
        return (baseMaior + baseMenor) * Altura/2;
    }

    @Override
    void exibir(){
        System.out.println("Trapézio -  Área: " + Area());
    }

}
