/***************************
* Aurthor : Nimesh Subedi
* Demo how to use scanner in combination
* with numbers and text.
***************************/

import java.util.Scanner;
public class DemoScanner
{
   public static void main(String[] args)
   {

      demoEscapeSequence();
      Scanner input = new Scanner(System.in);
      System.out.print("Please enter your Name : ");
      String Name = input.nextLine();
      System.out.print("Please enter your Age : ");
      int Age = input.nextInt();
      input.nextLine();  // clean up new line
      System.out.print("Please enter your Car company : ");
      String Car = input.nextLine();
      System.out.printf("%s is %d years old and rides a %s car.", Name, Age, Car);
   }
   
   private static void demoEscapeSequence()
   {
      // Demo escape sequence by drawing a bunny.
      System.out.println("(\\(\\");
      System.out.println("(-.-)");
      System.out.println("o_(\")(\")");
   }
}