/***********************************
* Aurthor : Nimesh Subedi
* Demo Nested Loop
************************************/

public class NestedLoop
{
   public static void main (String[] args)
   {
      for(int i = 0;i < 4; i++)
      {
         for(int j = 0;j < 2*i+2 ; j++)
         {
            System.out.print("o ");
         }
         for(int j = 0;j < 11 - 3 * i ; j++)
         {
            System.out.print("* ");
         }
         System.out.print(". ");
         for(int j = 0;j < 2 * i + 1; j++)
         {
            System.out.print("# ");
         }
         System.out.println();
      }
   }
}