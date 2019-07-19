/*****************************
* Aurthor : Nimesh Subedi
* Midterm : EagleApp
******************************/

public class EagleApp
{
   public static void main (String[] args)
   {
      Eagle myEagle = new Eagle(3);
      
      System.out.printf("mouseCount: %d%n", myEagle.getMouseCount());
      myEagle.fly();
      myEagle.catchMouse();
      System.out.printf("mouseCount: %d%n", myEagle.getMouseCount());
      
   }
}