/***************************
* Aurthor : Nimesh Subedi
* Lab Ball
***************************/

public class Ball
{
   private double size;
   
   public Ball(double ballSize_0){
      size = ballSize_0;
   }
   
   public double getSize(){
      return size;
   }
   
   public void setSize(double s){
      if (s >= 0){
         size = s;
      }
   }
   
   public void roll(){
      System.out.println("rolling...");
   }
   
   public void bounce(int numberOfBounces){
      System.out.println("bouncing " + numberOfBounces + " time");
   }
}