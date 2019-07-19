/***********************************
* Aurthor : Nimesh Subedi
* class point
************************************/

public class Pointsapp
{
   public static void main (String[] args)
   {
      Points myPoint = new Points(4,2);
      System.out.println("myPoint: " + myPoint);
      
      Points randomPoint = new Points();
      System.out.println("myPoint: " + randomPoint);
      System.out.println();
      
      for (int i = 0;i <= 5; i++){
         System.out.print(new Points()+"");
      }
      
      System.out.println("\n");
      
   }
}