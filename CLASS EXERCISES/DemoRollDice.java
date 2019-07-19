/***************************
* Aurthor : NIMESH SUBEDI
* DemoDice.
***************************/

import java.util.Random;
public class DemoRollDice
{
   private static Random rand = new Random();

   public static void main (String[] args)
   {
      demoSingleDie();
      demoRollingThreeDie();
   }
   private static void demoSingleDie()
   {
      System.out.println("Rolling Dice 10 times: ");
      for(int i = 0; i < 10; i++)
      {
         int die = rollDie();
         System.out.printf("%d ", rollDie());
      }
      System.out.println();
      System.out.println();
   }
   private static int rollDie()
   {
      return rand.nextInt(6) + 1;
   }
   private static void demoRollingThreeDie()
   {
      System.out.println("Rolling 3 Dice 10 times ");
      for(int i = 0; i < 10; i++)
      {
         int totalDiceCount = rollDie() + rollDie() + rollDie();
         System.out.printf("%d ", totalDiceCount);
      }
   }
}