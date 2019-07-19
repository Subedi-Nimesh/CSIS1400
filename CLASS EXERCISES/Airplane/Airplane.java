/***************************
* Aurthor : Nimesh Subedi
* Represents an Airplane
***************************/

public class Airplane
{
   private int wingspan =1;
   
   public Airplane(int theWingspan) {
      setWingspan(wingspan);
   }
   
   public int getWingspan(){
      return wingspan;
   }
   
   public void setWingspan(int theWingspan) {
      if (theWingspan > 0) {
         this.wingspan = theWingspan;
      }
   }
   
   public void launch(){
      System.out.println("...Launching");
   }
   
   public void land(){
      System.out.println("...Landing");
   }
}