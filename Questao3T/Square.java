package Questao3T;

public class Square extends Rectangle{
    private double Lado;

    public Square (Point A, Point B, Point C, Point D, double Lado){
        super( A, B, C, D, Lado, Lado);

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
