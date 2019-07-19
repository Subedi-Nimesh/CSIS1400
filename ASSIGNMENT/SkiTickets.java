/***************************
* Aurthor : NIMESH SUBEDI
* Date : 09/04/2017
* Assignment : A02.
***************************/

import java.util.Scanner;
public class SkiTickets
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      System.out.print("Number of adult tickets: ");
      int numOfAdultTickets = input.nextInt();
      System.out.print("Number of youth tickets: ");
      int numOfYouthTickets = input.nextInt();
      input.nextLine();
      System.out.print("Name: ");
      String name = input.nextLine();
      
      System.out.print("\n\n");
      System.out.printf("Invoice for %s: ", name);
      System.out.print("\n\n");
      
      double priceOfAdultTickets = numOfAdultTickets * 93.00;
      double priceOfYouthTickets = numOfYouthTickets * 47.00;
      double totalPrice = priceOfAdultTickets + priceOfYouthTickets;

      
      System.out.printf("Adult tickets  %-3d.. $%7.2f%n", numOfAdultTickets, priceOfAdultTickets);
      System.out.printf("Youth tickets  %-3d.. $%7.2f%n", numOfYouthTickets, priceOfYouthTickets);
      System.out.printf("-----------------------------%n");
      System.out.printf("                     $%7.2f%n", totalPrice);
      System.out.println("                     ========");
   }
}