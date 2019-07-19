/***************************
* Aurthor : Nimesh Subedi
* Demo
***************************/

public class EuclideanAlgorithm
{
   public static void main (String[] args) 
   {
      System.out.println("gcd(4, 4): " + gcd(4, 4));
      System.out.println("gcd(24, 6): " + gcd(24, 6));
      System.out.println("gcd(3, 10): " + gcd(3, 10));
      System.out.println("gcd(8, 6): " + gcd(8, 6));
      System.out.println("gcd(4, 8): " + gcd(4, 8));
   }
   
   private static int gcd(int a, int b)
   {
   while (a!=b)
   {
      if (a > b)
      {
         a = a - b;
      }
      else
      {
         b = b - a;
      }
   }
      return a;
   }
}