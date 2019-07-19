/***********************************
* Aurthor : Nimesh Subedi
* Date Moditfied : 10/20/2017
* Assignment : A08
************************************/

import java.util.Scanner;
public class PatternApp
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
            
      int number;
      int size;

      do
      {
         System.out.print("Choose a pattern(1-4) or 0 to quit: ");
         number = input.nextInt();
         if ((number > 0) && (number < 5))
         {
            System.out.print("Size: ");
            size = input.nextInt();
            switch(number)
            {    
               case 1:    
                  Pattern.pattern1(size);    
                  break;
               case 2:    
                  Pattern.pattern2(size);
                  break;    
               case 3:    
                  Pattern.pattern3(size);
                  break;
               case 4:    
                  Pattern.pattern4(size);
                  break;
            }
         }   
      } while(number != 0);
      System.out.print("Good Bye");

   }
}