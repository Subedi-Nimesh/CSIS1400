/***********************************
* Aurthor : Nimesh Subedi
* Date Moditfied : 10/20/2017
* Assignment : A08
************************************/

import java.util.Scanner;
public class Pattern
{   
   public static void pattern1(int size)
   {
      for(int i = 0;i < size; i++)
      {
         System.out.print("o");
         for(int j = 0;j < (size - 1) - i ; j++)
         {
            System.out.print(" ");
         }
         
         System.out.print("//");
         for(int j = 0;j < 2*i ; j++)
         {
            System.out.print(" ");
         }
         System.out.print("\\\\");
         System.out.print(".");
         System.out.println();
      }
      System.out.println();
   }
   public static void pattern2(int size)
   {
      for(int i = 0;i < size; i++)
      {
         
         for(int j = 0;j < (size - 1) - i ; j++)
         {
            System.out.print(" ");
         }
         System.out.print(".");
         System.out.print("//");
         for(int j = 0;j < 2*i ; j++)
         {
            System.out.print(" ");
         }
         System.out.print("\\\\");
        for(int j = 0;j < (size - 1) - i ; j++)
        {
           System.out.print(" ");
        }
         System.out.print("o");
         System.out.println();
      }
      System.out.println();
   }
   public static void pattern3(int size)
   {
      for(int i = 0;i < size; i++)
      {
         System.out.print("o");
         for(int j = 0;j < i ; j++)
         {
            System.out.print(" ");
         }
         
         System.out.print("\\\\");
         for(int j = 0;j < (2 * size - 2) - 2 * i; j++)
         {
            System.out.print(" ");
         }
         System.out.print("//");
         System.out.print(".");
         System.out.println();
      }
      System.out.println();
   }
   public static void pattern4(int size)
   {
      for(int i = 0;i < size; i++)
      {
         for(int j = 0;j < i ; j++)
         {
            System.out.print(" ");
         }
         System.out.print(".");
         System.out.print("\\\\");
         for(int j = 0;j < (2 * size - 2) - 2 * i ; j++)
         {
            System.out.print(" ");
         }
         System.out.print("//");
         for(int j = 0;j < i ; j++)
        {
           System.out.print(" ");
        }
         System.out.print("o");
         System.out.println();
      }
      System.out.println();
   }
}