/*****************************
* Aurthor : Nimesh Subedi
* Lab HoppityHop.
******************************/

public class HoppityHop
{
   public static void main (String[] args)
   {
      int n = 25;
      hoppityHop(n);
   }
   
   private static void hoppityHop(int n) {
      for(int i = 1; i <= n; i++) {
      
         if  (i%3==0&&i%5==0){
            System.out.println("Hoppity Hop");
         }
         
         else if (i%3==0){
            System.out.println("Hoppity");
         }
         
         else if  (i%5==0){
            System.out.println("Hop");
         }
         
         else{
            System.out.println(i);
         }
      }
   }
}