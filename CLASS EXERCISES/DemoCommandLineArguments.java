/***********************************
* Aurthor : Nimesh Subedi
* Demo how to use command line arguments
*
* jGraps: to use command line argument
* go to build > Run Arguments
************************************/

import java.util.Scanner;
public class DemoCommandLineArguments
{
   public static void main (String[] args)
   {
      for(String el : args)
      {
         System.out.print(el + " ");
      }
      System.out.println();
      
      int sum = 0;
      boolean first = true;
      for(String el : args)
      {
         if(first)
         {
            System.out.print(el);
            first = false;
         }
         else
            System.out.print(" + " + el);
         sum += Integer.parseInt(el);
      }
      System.out.println(" = " + sum);
   }
}