/***************************
* Aurthor : Nimesh Subedi
* Demo the use of for loop
***************************/

public class DemoForLoop
{
   public static void main (String[] args)
   {
      // demoDoSomtingsNtimes();
      demoNumberLines();
   }
   
   private static void demoNumberLines()
   {
      for (int i = 2; i <= 22; i+=5)
      {
         System.out.printf("%3d ", i);
      }
      
      System.out.println();
      
      for (int i = -7; i >= -16; i -= 3)
      {
         System.out.printf("%3d ", i);
      }
      
      System.out.println();
      System.out.println();
      
      for (int i = 1; i <= 10; i ++)
      {
         System.out.printf("%2d .. %3d%n", i ,i*i );
      }
   }
   
   
   private static void demoDoSomtingsNtimes(){
   
      for (int i=1; i<=5; i++) // we need escape sequence to print \ or " 
      {
         System.out.print("/\"\\");
      }
      
      System.out.println();
      
      for (int i=1; i<=5; i++)
      {
         System.out.print("\t\\");
      }
      
      System.out.println();
    
      for (int i=1; i<=5; i++)
      {
         System.out.print("\t/");
      }
      
      System.out.println();
      
      for (int i=1; i<=5; i++)
      {
         System.out.print("\\o/");
      }
   }
}