/***********************************
* Aurthor : Nimesh Subedi
* Demo Resizing Patterns
************************************/

import java.util.Scanner;
public class DemoResizingPatterns
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Size of a Triangle : ");
      int size = input.nextInt();      
      printTriangle(size);
   }
   
   
   private static void printTriangle(int size)
   {
      for(int i = 0;i < size; i++)
      {
         for(int j = 0; j < (size -1) - i ; j++)
         {
            System.out.print(". ");
         }
         for(int j = 0; j < 2 * i + 1 ; j++)
         {
            System.out.print("o ");
         }
         
         System.out.println();
      }
   }
}