/*****************************
* Aurthor : Nimesh Subedi
* Determine whether two numbers
* build a golden ratio.
******************************/

public class GoldenRatio
{
   public static void main (String[] args)
   {
      int number1 = 100004;
      int number2 = 161800;
      
      System.out.printf("isGoldenRatio(%d,%d): %b%n",
         number1, number2, isGoldenRatio(number1, number2));
         
   }
   
   private static boolean isGoldenRatio(int n1, int n2)
   {
      double goldenRatio = 1.618;
      double q;
      if (n1 > n2) {   
         q = 1d * n1 / n2;
                
      }
      else {
         q = 1d * n2 / n1;
      }
      
      double roundedQ = Math.round(q * 1000) / 1000d;
      
      return roundedQ == goldenRatio;
   }
}