/***********************************
* Aurthor : Nimesh Subedi
* Creates a Story
************************************/

import java.util.Scanner;
public class Story
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      StoryApp myStory = new StoryApp();
      
      int choice = 0;
      
      do
      {
         System.out.println("Please select scenario :");
         System.out.println("1 for Scenario 1 :");
         System.out.println("2 for Scenario 2 :");
         System.out.println("3 for Scenario 3 :");
         System.out.print("0 to Exit : ");
         choice = input.nextInt();
         
         switch (choice)
         {
            case 1:  myStory.scenario1();
                     break;
            case 2:  myStory.scenario2();
                     break;
            case 3:  myStory.scenario3();
                     break;
            case 0:  break;
            default: System.out.println("Invalid Entry");
                     break;
         }
         System.out.println();
         
      } while(choice != 0);
   }
}