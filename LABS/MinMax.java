/***************************
* Aurthor : Nimesh Subedi
* Lab MinMax
***************************/

import java.util.Scanner;
public class MinMax
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Number1 : ");
      int number1 = input.nextInt();
      System.out.print("Number2 : ");
      int number2 = input.nextInt();
      
      if (number1 < number2)
      {
         System.out.print(number1 + " is less than " + number2);
      }
      if (number1 > number2)
      {   
         System.out.print(number1 + " is greater than " + number2);
      }
      if (number1 == number2)
      { 
         System.out.print(number1 + " is equal than " + number2);
      }   
   }
}