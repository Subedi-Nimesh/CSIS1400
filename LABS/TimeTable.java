/**************************
* Aurthor : Nimesh Subedi
* Lab : Time Table
***************************/

import java.util.Scanner;
public class TimeTable
{
   public static void main (String[] args)
   {
      int n;
      for(int i = 1; i <= 10; i+=2)
      {
         n = i + 1;
         for (int j = 1; j <= 10; j ++)
         {
            System.out.printf("%2d * %d = %d\t\t%2d * %d = %d%n",
               j, i, i*j, j, n , j*n);
         }
         System.out.println();
      }
   }
}