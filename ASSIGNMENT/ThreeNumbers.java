/*****************************
* Aurthor : Nimesh Subedi
* Assignment : A03
******************************/

import java.util.Scanner;
public class ThreeNumbers
{
   public static void main (String[] args)
   {
      Scanner input = new Scanner(System.in);
      
      int temp = 0;
   
      System.out.print("Enter 3 numbers separated by a space: "); // Prompt the user 
      int n1 = input.nextInt();
      int n2 = input.nextInt();
      int n3 = input.nextInt();
      
      if (n1 > n2){ // Arranging the numbers in accending order 
         temp = n1;
         n1 = n2;
         n2 = temp;
      }
      
      if (n1 > n3){
         temp = n1;
         n1 = n3;
         n3 = temp;
      }
      
      if (n2 > n3){
         temp = n2;
         n2 = n3;
         n3 = temp;
      }
           
      System.out.println("Sorted numbers: " + n1 + " " + n2 + " " + n3);
   }
}