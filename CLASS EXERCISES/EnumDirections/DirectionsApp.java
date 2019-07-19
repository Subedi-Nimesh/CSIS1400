/***********************************
* Aurthor : Nimesh Subedi
* Enum App
************************************/

public class DirectionsApp
{
   public static void main (String[] args)
   {
      Directions myDirections = Directions.RIGHT;
      
      System.out.println("myDirection .. " + myDirections);
      System.out.println("Other Directions .. " + Directions.UP);
      
      System.out.println("All direction : ");
      Directions[] allDirections = Directions.values();
      for(Directions el : allDirections)
      {
         System.out.print(el + " ");
      }
      
      for(int i = 0; i < allDirections.length() - 1; i++) {
      
      }
      
      
      
      System.out.println();
      System.out.println("Second Directions .. " + allDirections[1]);
   }
}