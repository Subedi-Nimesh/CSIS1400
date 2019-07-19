/***************************
* Aurthor : Nimesh Subedi
* Test client for Lab Ball
***************************/

public class BallApp
{
   public static void main (String[] args)
   {
      Ball myBall = new Ball(5);
      
      System.out.printf("Ball with size %.0f%n", myBall.getSize());
      
      myBall.roll();
      myBall.bounce(14);
      myBall.setSize(7);
      
      System.out.printf("size: %.0f%n", myBall.getSize());
   }
}