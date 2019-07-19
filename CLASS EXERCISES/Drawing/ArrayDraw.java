/***************************
* Aurthor : NIMESH SUBEDI
* Array
***************************/

import java.awt.Color;
public class ArrayDraw
{
   public static void main (String[] args)
   {
      double[] data = {0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9};
      
      StdDraw.setPenColor(Color.GREEN);
      //still to do: adjustdistance between the bars 
      for(int i = 0; i < data.length - 1; i++)
      {
         StdDraw.filledRectangle(0.1 * i + 0.1, data[i]/2, 0.01 ,data[i]/2);
      }
   }
}