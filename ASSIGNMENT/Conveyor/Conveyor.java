/*****************************
* Aurthor : Nimesh Subedi
* Assignment : A04
******************************/

public class Conveyor
{
   // fields
   private String type;
   private double speed; //measured in m/s 
   
   // constructors
   public Conveyor(String type, double speed) 
   {
      this.type = type;
      setSpeed(speed);
   }
    
   // methods
   public String getType(){
      return type;
   }
   
   public double getSpeed(){
      return speed;
   }
   
   public void setSpeed(double speed) {
      if (speed >= 0) { 
         this.speed = speed;
      }
   }
   
   public double timeToTransport(double distance) {
      double t = distance / speed;
   return t;
   }
}