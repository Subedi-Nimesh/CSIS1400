/***************************
* Aurthor : Nimesh Subedi
* Test client for Airplane
***************************/

public class AirplaneApp
{
   public static void main (String[] args)
   {
      Airplane myAirplane = new Airplane(-2);
      myAirplane.setWingspan(2);
      myAirplane.launch();
      System.out.println("Wingspan: " + myAirplane.getWingspan());
      myAirplane.land();
   }
}