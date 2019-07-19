/*****************************
* Aurthor : Nimesh Subedi
* Midterm : Exercise 1
* The following program generates
* random numbers until the random
* is equals to 100
******************************/


import java.util.Random;
public class Exercise1
{
   public static void main (String[] args)
   {
      Random rand = new Random();
      
      int number;
      int i = 1;
      String multipleOf13 = "..x13";
      
      do
      {
         number = rand.nextInt(40) + 93;
         if (number % 13 == 0)
         {
            System.out.printf("%6s", multipleOf13);
         }
         else if(number < 100)
         {
            System.out.printf("   _" + number);
         }
         else
         {
            System.out.printf("%6d", number);
         }
         
         if (i % 8 ==0){
            System.out.println();
         }
         i = i + 1;
      } while(number != 100);    
      System.out.println();
      System.out.print("the end");
   }
}