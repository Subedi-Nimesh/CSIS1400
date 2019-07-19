/**************************
* Aurthor : Nimesh Subedi
* Demo how to declare, initialize
* and use variables and how to
*read input from the user
***************************/

import java.util.Scanner;
public class DemoVariable
{
   public static void main (String[] args)
   {
      String college = "SLCC";
      int numberofstudent = 60000;
      System.out.printf("%s has %d students. %n", college, numberofstudent);
      Scanner input = new Scanner(System.in);
      System.out.print("Number of new Students : ");
      int newstudent = input.nextInt();
      numberofstudent = numberofstudent + newstudent;
      System.out.printf("%s has %d students.", college, numberofstudent);
   }
}   