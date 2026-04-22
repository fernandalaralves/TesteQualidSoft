package Questao3_Quadrilateral;

public abstract class Quadrilateral {
    private  Point A;
    private  Point B;
    private  Point C;
    private  Point D;

    public Quadrilateral(Point A, Point B, Point C, Point D)
    {
        if (A.equalTo(B)|| A.equalTo(C) || A.equalTo(D) || B.equalTo(C) || B.equalTo(D) || C.equalTo(D))
            throw new IllegalArgumentException("Quadrilatero possui vertices coicidentes");
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
    }

    public Point getA() {

        return A;
    }

    public Point getB() {

        return B;
    }

    public Point getC() {

        return C;
    }

    public Point getD() {

        return D;
    }

    public String toString()
    {
        return String.format("A%s - B%s - C%s - D%s", A,B,C,D );
    }

    public abstract double getArea();
}
