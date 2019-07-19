/***************************
* Aurthor : Nimesh Subedi
* Lab Marbles
***************************/

import java.util.Scanner;
public class LabMarbles
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      System.out.print("Color1 : ");
      String Color1 = input.nextLine();
      System.out.printf("Number of %s marbles : ", Color1);
      int number1 = input.nextInt();
      input.nextLine();
      
      System.out.print("Color2 : ");
      String Color2 = input.nextLine();
      System.out.printf("Number of %s marbles : ", Color2);
      int number2 = input.nextInt();
      input.nextLine();
      
      System.out.print("Color3 : ");
      String Color3 = input.nextLine();
      System.out.printf("Number of %s marbles : ", Color3);
      int number3 = input.nextInt();
      input.nextLine();
      System.out.println();
      
      System.out.println("Color         Number of Marbles");
      System.out.println("-------------------------------");
      System.out.printf("%-12s %10d%n", Color1, number1);
      System.out.printf("%-12s %10d%n", Color2, number2);
      System.out.printf("%-12s %10d%n", Color3, number3);
   }
}