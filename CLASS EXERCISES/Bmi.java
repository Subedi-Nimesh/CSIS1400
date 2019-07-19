/***********************************
* Aurthor : Nimesh Subedi
* Program that calculates BMI
* and provides feedback to the User
************************************/

import java.util.Scanner;
public class Bmi
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      String choice = "yes";
      
      while(choice.equalsIgnoreCase("yes"))
      {
         System.out.print("Weight : ");
         int weight = input.nextInt();
         System.out.print("Height : ");
         int height = input.nextInt();
          
         double BMI = weight*703d/(height*height);
         
         if (BMI < 18.5)
            System.out.println("You are under weight. EAT MORE");
         else if (18.5 >= BMI && BMI < 25)
            System.out.println("You are perfect weight. MAINTAIN YOUR DIET");
         else if (25 >= BMI && BMI < 30)
            System.out.println("You Are over weight. DON'T EAT TOO MUCH");
         else if (BMI >= 30) 
            System.out.println("You are Obese. YOU ARE CRAZY FOOD LOVER"); 
         System.out.println();
         
         System.out.print("Do you wish to continue : ");
         choice = input.next();
      }

   }
}