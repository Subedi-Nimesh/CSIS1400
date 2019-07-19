/*****************************
* Aurthor : Nimesh Subedi
* Represents a Remote control
******************************/

public class Remote
{
   // field 
   private boolean on; // Original value : Off 
   private int channel; // Original value : 0
   private String color;
   private final int MAX_CHANNEL = 3;
   
   // constructor
   public Remote() {
   }
   
   public Remote(String c){
      setColor(c);
   }
   
   // method
   public String getColor(){
      return color;
   }
   
   public void setColor(String color){
      this.color = color;
   }
      
   public void onOff()
   {
      on = !on;
            
      if (on == true)
         System.out.println("Playing channel is " + channel);
      else
         System.out.println("T.V. is Off");
   }
   
   public void channelUp()
   {
      if (channel == MAX_CHANNEL)
         channel = 0;
      else
         channel = channel + 1;
   }
   
   public void channelDown()
   {
      channel = channel - 1;
      
      if (channel < 0){
         channel= MAX_CHANNEL;
      }
   }

   @Override 
   public String toString()
   {
      return "channel is = " + channel + " on = " + on;
   }
}