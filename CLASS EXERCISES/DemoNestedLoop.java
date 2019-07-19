/***********************************
* Aurthor : Nimesh Subedi
* Demo Nested Loop
************************************/

public class DemoNestedLoop
{
   public static void main (String[] args)
   {
      for(int i = 0;i < 5; i++)
      {
         for(int j = 0;j < 4 - i ; j++)
         {
            System.out.print("  ");
         }
         System.out.print("o o o o o ");
         System.out.print("_ ");
         for(int j = 0;j < 2*i ; j++)
         {
            System.out.print("  ");
         }
         System.out.print("_ ");
         System.out.print("o o o o o ");
         System.out.println();
      }
   }
}