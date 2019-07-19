/***************************
* Aurthor : NIMESH SUBEDI
* Date : 11/08/2017
* Assignment : Dice.
***************************/

import java.util.Random;
public class Dice
{
   private static Random rand = new Random();
   private static int[] FrequencyOfRollednumber = new int[11];
   
   public static void main (String[] args)
   {
      System.out.println("Sum  Frequency  Percentage");
      rollingTwoDie();
      for(int i = 0; i < 11; i++)
         {
            System.out.printf("%3d %10d %10.1f%% %n",
               i+2, FrequencyOfRollednumber[i], (FrequencyOfRollednumber[i]*100.0)/36000);
         }
   }
   
   private static void rollingTwoDie()
   {
      int firstDie;
      int secondDie;
      int sumDiceCount;
      
      for(int i = 0; i < 36000; i++)
      {
         firstDie = rollDie();
         secondDie = rollDie();
         sumDiceCount = firstDie + secondDie;
         
         FrequencyOfRollednumber[sumDiceCount-2] += 1; 
      }
   }
   
   private static int rollDie()
   {
      return rand.nextInt(6) + 1;
   }
}