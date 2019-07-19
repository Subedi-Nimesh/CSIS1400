/*****************************
* Aurthor : Nimesh Subedi
* Assignment : A04
******************************/

public class ConveyorApp
{
   public static void main (String[] args)
   {
      Conveyor flatBeltConveyor = new Conveyor("flat belt", 0.9);
      Conveyor rollerConveyor = new Conveyor("roller", -0.5);
      
      System.out.printf("Conveyor1: %s conveyor with a speed of %.1f m/s%n", flatBeltConveyor.getType(), flatBeltConveyor.getSpeed());
      System.out.printf("Time to transport an item 50 m: %.1f s%n%n", flatBeltConveyor.timeToTransport(50));
      System.out.printf("Conveyor2: %s conveyor with a speed of %.1f m/s%n", rollerConveyor.getType(), rollerConveyor.getSpeed());
      System.out.printf("Time to transport an item 50 m: %.1f s%n%n", rollerConveyor.timeToTransport(50));
    
      System.out.println(".. updating speed");
      System.out.println("");
     
      flatBeltConveyor.setSpeed(-3);
      rollerConveyor.setSpeed(0.4);
      
      
      System.out.printf("Conveyor1: %s conveyor with a speed of %.1f m/s%n", flatBeltConveyor.getType(), flatBeltConveyor.getSpeed());
      System.out.printf("Time to transport an item 50 m: %.1f s%n%n", flatBeltConveyor.timeToTransport(50));
      System.out.printf("Conveyor2: %s conveyor with a speed of %.1f m/s%n", rollerConveyor.getType(), rollerConveyor.getSpeed());
      System.out.printf("Time to transport an item 50 m: %.1f s%n%n", rollerConveyor.timeToTransport(50));
   }
}