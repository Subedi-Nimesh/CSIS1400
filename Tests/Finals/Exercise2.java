/***********************************
* Aurthor : Nimesh Subedi
* The following class creates two arrays
* And replaces the last element and then updates the
* Array, fings the length of the array
* And also finding the length of each element
* And putting it in a different array and printing
* The array
************************************/

import java.util.Arrays;
public class Exercise2
{
   public static void main (String[] args)
   {
      //Creates an Array and initialize it 
      String[] words = {"one", "two", "three", "four", "five", "six", "seven", "eight", "nine", "10"};
      System.out.println("words: " + Arrays.toString(words));
      
      //Counts and Prints the number of elements in the array. 
      System.out.println("number of elements: " + words.length);
      words[words.length - 1] = "ten";
      System.out.println();
      
      // Creates a new Array 
      int[] wordLengths = new int[words.length];      
      
      //Initialize the array with the count of corresponding elements of the previous array. 
      for(int i = 0; i < words.length; i++)
      {
         wordLengths[i] = words[i].length();
      }

      //Prints the elements of the first array 
      for (String el : words)
      {
         System.out.printf("%-6s", el);
      }
      
      System.out.println();  
      
      //Prints the elements of the second array 
      for (int el : wordLengths)
      {
         System.out.printf("%-6d", el);
      }          
   }
}