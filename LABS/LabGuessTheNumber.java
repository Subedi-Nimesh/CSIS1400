/***************************
* Aurthor : Nimesh Subedi
* Lab Guess The Number
***************************/

import java.util.Random;
import java.util.Scanner;
public class LabGuessTheNumber
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      Random rand = new Random();
      
      int choice;
      int secretNumber = rand.nextInt(50)+1;
      
      do 
      {
         System.out.println("Guess a number (1 - 50): ");
         choice = input.nextInt();
         
         if(choice == secretNumber)
         {
            System.out.printf("You have got it%n");
         }   
         else if (secretNumber < choice){
            System.out.printf("Too Big%n");
         }
         else{
            System.out.printf("Too Small%n");
         }
         System.out.println();
      } while (choice != secretNumber);
      
      
   }
}