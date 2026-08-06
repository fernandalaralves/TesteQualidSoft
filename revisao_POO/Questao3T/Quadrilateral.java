package Questao3T;

public class Quadrilateral {

   private Point A;
   private Point B;
   private Point C;
   private Point D;

   public Quadrilateral(Point A, Point B, Point C, Point D){
       this.A = A;
       this.B = B;
       this.C = C;
       this.D = D;
   }

   double Area() {
       return 0;
   }

   void exibir() {
       System.out.println("Quadrilatero - Area:" + Area());
   }
}
