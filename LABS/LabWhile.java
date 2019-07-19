/***************************
* Aurthor : Nimesh Subedi
* Lab While
***************************/

import java.util.Scanner;
public class LabWhile
{
   public static void main (String[] args)
   {
      multiplyNumbers();
   }

   public static void multiplyNumbers()
   {
      Scanner input = new Scanner(System.in);
      int product = 1;
      
      System.out.print("Number(0 to Quit): ");
      int number = input.nextInt();
      
      while(number != 0)
      {
         product = product * number;
         
         System.out.print("Number(0 to Quit): ");
         number = input.nextInt();
      }
      System.out.printf("Product: %d%n", product);
   }
}