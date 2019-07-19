/***********************************
* Aurthor : Nimesh Subedi
* The following class creates a ArrayList
* And adds 8 elements and then updates the
* List by removing, adding, and setting
* Different elements 
************************************/

import java.util.ArrayList;
public class Exercise1
{
   public static void main (String[] args)
   {
      // Creates an arrayList called numberList 
      ArrayList<Double> numberList = new ArrayList<>();
      
      // Adds different elements to numberList 
      numberList.add(0.125);
      numberList.add(0.25);
      numberList.add(0.375);
      numberList.add(0.55);
      numberList.add(0.625);
      numberList.add(0.75);
      numberList.add(0.875);
      numberList.add(1.0);

      // Prints all the element in numberList 
      System.out.println("numberList: " + numberList);
      
      // Some functions in numberList 
      numberList.set(3, 0.5);
      numberList.add(0, 0.0);
      numberList.remove(numberList.size() - 1);
      
      // Prints the updated List  
      System.out.print("updated List: ");
      for (int i = 0; i < numberList.size(); i++)
      {
         System.out.print(numberList.get(i) + "  ");
      }
   }
}