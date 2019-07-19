
import java.util.Scanner;

public class CubeVolume {
   public static void main (String[] args) {
      Scanner scnr = new Scanner(System.in);
      int sideLength = 0;
      Long cubeVolume;
      
      System.out.println("Enter cube's side length: ");
      sideLength = scnr.nextInt();
   
      cubeVolume = (long)sideLength * sideLength* sideLength;
      
      System.out.println("Cube's volume is: " + cubeVolume);
      
      return;
   }
}