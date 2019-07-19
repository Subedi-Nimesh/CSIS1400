/***************************
* Aurthor : Nimesh Subedi
* Test client for Circle
***************************/

import java.util.Scanner;
public class ProjectCircleApp
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      ProjectCircle myCircle = new ProjectCircle(2.5);
      
      String choice;
      do 
      {
         printMenu();
         choice = input.next();
         
         switch(choice.toUpperCase())
         {
            case "A":
               System.out.printf("Radius: %.1f%n", myCircle.getRadius());
               break;
            case "B":
               System.out.printf("Diameter: %.1f%n", myCircle.diameter());
               break;
            case "C":
               System.out.printf("Radius: %.1f%n", myCircle.area());
               break;
            case "DONE":
               break;
            default:
               System.out.printf("Invalid Choice%n");
               break;
         }
         System.out.println();
      }while (!choice.equalsIgnoreCase("DONE"));
      System.out.printf("Good Bye%n");
      
   }
   
   private static void printMenu()
   {
      System.out.println("A..Radius");
      System.out.println("B..Diameter");
      System.out.println("C..Area");
      System.out.println("done..exit");
      System.out.print("Your choice please: ");
   }
}