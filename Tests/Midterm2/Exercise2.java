/****************************************
* Aurthor : Nimesh Subedi
* Midterm : Exercise 2
* The following program prints a pattern
* using a nested loop
****************************************/

public class Exercise2
{
   public static void main (String[] args)
   {
      for(int i = 0; i < 4; i++)
      {
         for(int j = 0;j < 6 - 2 * i ; j++)
         {
            System.out.print(". ");
         }
         
         System.out.print("@ ");
         
         for(int j = 0;j < 2*i ; j++)
         {
            System.out.print("- ");
         }
         
         System.out.print("@ ");
         
         for(int j = 0;j < 3 - i ; j++)
         {
            System.out.print(". ");
         }
         
         System.out.print("@");
         System.out.println();
      }
      System.out.println();
   }
}