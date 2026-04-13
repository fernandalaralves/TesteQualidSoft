package Questao3T;

public class Square extends Quadrilateral{
    private double Lado;

    public Square (Point A, Point B, Point C, Point D, double Lado){
        super( A, B, C, D);

        this.Lado = Lado;
    }

    @Override
    double Area(){
    return Lado * Lado;
    }

    @Override
    void exibir(){
        System.out.println("Quadrado -  Área: " + Area());
    }
}
