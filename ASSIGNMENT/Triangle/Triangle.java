/*****************************
* Aurthor : Nimesh Subedi
* Assignment : A05
******************************/

public class Triangle
{
   private double side1;
   private double side2;   
   private double side3;
   
   public Triangle(double side1, double side2, double side3) 
   {
      if(isTriange(side1, side2, side3){
      this.side1 = side1;
      this.side2 = side2;
      this.side3 = side3;
      }
      else{
      this.side1 = 1d;
      this.sidd2 = 1d;
      this.side3 = 1d;
      }
   }
    
   public double getSide1(){
      return side1;
   }
   
   public double getSide2(){
      return side2;
   }
   
   public double getSide3(){
      return side3;
   }
   
   private boolean isTriangle(double side1, double side2, double side3) {
      if ((side1+side2>side3) && (side1+side3>side2) && (side2+side3>side1)) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public boolean isEquilateral() {
      if ((side1 == side2) && (side2 == side3)) {
         return true;
      }
      else {
         return false;
      }
   }
   
   public boolean isRight() {
      if ((side1 > side2)&&(side1 > side3)) {
         if (side1*side1 == side2*side2 + side3*side3) {
            return true;
         }
         else {
            return false;
         }
      }
      
      else if ((side2 > side1)&&(side2 > side3)) {
         if (side2*side2 == side1*side1 + side3*side3) {
            return true;
         }
         else {
            return false;
         }
      }
      
      else if((side3 > side1)&&(side3 > side2)) {
         if (side3*side3 == side1*side1 + side2*side2) {
            return true;
         }
         else {
            return false;
         }
      }
      
      else {
         return false;
      }
   }
}