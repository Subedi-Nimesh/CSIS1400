/*****************************
* Aurthor : Nimesh Subedi
* Represents a Remote control
******************************/

public class RemoteApp
{
   public static void main (String[] args)
   {
      Remote myRemote = new Remote();
      myRemote.channelUp();
      myRemote.channelUp();
      System.out.println("myRemote: " + myRemote.toString());
      
      myRemote.channelUp();
      myRemote.channelUp();
      myRemote.onOff();  // channel is 0 at this point
       
      myRemote.channelDown();
      System.out.println("myRemote: " + myRemote.toString());
   }
}