/***************************
* Aurthor : Nimesh Subedi
* Assignment : A07
***************************/

import java.util.Random;
public class ManyGreetings
{
   public static void main (String[] args)
   {
      Random rand = new Random();
      int n = rand.nextInt(291) + 10;
      
      for (int i = 1;i <= n; i++) {
         double val = i % 100;
         if (val == 11 || val == 12 || val == 13){
            System.out.printf("%dth greeting%n",i);
         }
         else {
            val = i % 10;
            if(val == 1){
               System.out.printf("%dst greeting%n",i);
            }
            else if(val == 2){
               System.out.printf("%dnd greeting%n",i);
            }
            else if(val == 3){
               System.out.printf("%drd greeting%n",i);
            }
            else{
               System.out.printf("%dth greeting%n",i);
            }
         }
      }
      System.out.println();
   }
}