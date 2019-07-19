/***********************************
* Aurthor : Nimesh Subedi
* test cleint for class point 
************************************/

import java.util.Random;

public class Points
{
   //Field
   private int x;
   private int y;
   private final Random rand = new Random();
   
   //Constructor
   public Points(int x, int y)
   {
      this.x = x;
      this.y = y;
   }
   
   public Points()
   {
      this.x = rand.nextInt(4) * 2 + 2;
      this.y = rand.nextInt(4) * 2 + 2;
   }
   
   //Methods   
   public int getX(){
      return x;
   }
   
   public int getY(){
      return y;
   }
   
   @Override
   public String toString()
   {
      return "(" + x + "," + y + ")";
   }
}