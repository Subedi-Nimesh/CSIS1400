/*****************************
* Aurthor : Nimesh Subedi
* Demo how to draw
*****************************/

import java.awt.Color;
public class DemoDraw
{
   public static void main (String[] args)
   {
      for(int i = 0; i < 9 ; i++)      // for all rows 
      {
         for(int j = 0; j < 9 ; j ++)  // for all squares within a row 
         {
            StdDraw.setPenColor(getColor(j));
            if(i % 2 == 0)             // if row is even 
            {
               StdDraw.square(0.11 * j + 0.06, 0.94 - 0.11 * i, 0.05);
            }
            else
            {
               StdDraw.filledSquare(0.11 * j + 0.06, 0.94 - 0.11 * i, 0.05);
            }
            
         }
         System.out.println();
      }
   }
   
   
   private static Color getColor(int column)
   {
      switch(column)
      {
         case 1:
         case 2:
            return Color.ORANGE;
         case 4:
            return Color.RED;
         case 6:
            return Color.BLUE;
         case 8:
            return Color.YELLOW;
         default:
            return Color.BLACK;
      }
   }
}