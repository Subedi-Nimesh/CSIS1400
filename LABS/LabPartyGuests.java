/***************************
* Aurthor : Nimesh Subedi
* Lab PartyGuests
***************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;

public class LabPartyGuests
{
   public static void main (String[] args)
   {
      Random rand = new Random();
      Scanner input = new Scanner(System.in);
      ArrayList<String> guestList = new ArrayList<String>();
      
      int numberOfGuests = 4;
      System.out.printf("Please enter %d guests: ", numberOfGuests);
      System.out.println();
      
      for(int i = 0; i < numberOfGuests; i++)
      {
         System.out.printf("Guests %d: ", i+1);
         guestList.add(input.nextLine());
      }
      
      System.out.println();
      System.out.println("Guest list: " + guestList);
      int randomGuest = rand.nextInt(4);
      System.out.println(guestList.get(randomGuest) + " can't come.");
      guestList.remove(randomGuest);
      System.out.print("Updated guest list: " + guestList);
   }
}