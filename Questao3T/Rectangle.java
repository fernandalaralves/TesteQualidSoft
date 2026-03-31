package Questao3T;

public class Rectangle extends Parallelogram{
    private double Largura;
    private double Comprimento;

    public Rectangle(Point A, Point B, Point C, Point D, double Largura, double Comprimento) {

        super(A, B, C, D, Largura, Comprimento);
        this.Largura = Largura;
        this.Comprimento = Comprimento;
    }

    @Override
    double Area(){
        return Largura * Comprimento;
    }

    @Override
    void exibir(){
        System.out.println("Retângulo - Área: " + Area());
    }
}
