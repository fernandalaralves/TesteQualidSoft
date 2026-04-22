package Questao3_Quadrilateral;

public class Square extends Quadrilateral
{
    public Square( Point A, Point B, Point C, Point D)
    {
        /* Tratamento de exceção*/

        super(A,B,C,D);
    }

    @Override
    public double getArea()
    {
        return Math.pow( getA().distanceTo(getB()), 2.0);
    }

}
