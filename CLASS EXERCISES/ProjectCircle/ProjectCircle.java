/***************************
* Aurthor : Nimesh Subedi
* Class Circle
***************************/

public class ProjectCircle
{
   //fields
   private double radius;
   
   
   //constructors
   public ProjectCircle(double radius)
   {
      this.radius = radius;
   }
   
   //methods
   public double getRadius()
   {
      return radius;
   }
   public double diameter()
   {
      return 2 * radius;
   }
   public double area()
   {
      return Math.PI * radius * radius;
   }
   
   @Override
   public String toString(){
      return "(" + radius + ")";
   }
}