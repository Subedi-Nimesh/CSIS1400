/*****************************
* Aurthor : Nimesh Subedi
* Midterm : Eagle
******************************/

public class Eagle
{
   private int mouseCount;
   
   public Eagle(int count) {
      mouseCount = count;
   }
    
   public int getMouseCount() {
      return mouseCount;
   }
   
   public void fly() {
      System.out.println("flying . . .");
   }
   
   public void catchMouse() {
      mouseCount++;
      
   }
}